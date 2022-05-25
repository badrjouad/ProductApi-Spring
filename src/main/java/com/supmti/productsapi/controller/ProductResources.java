package com.supmti.productsapi.controller;


import com.supmti.productsapi.entity.Product;
import com.supmti.productsapi.dto.ProductDTO;
import com.supmti.productsapi.service.api.AuthServiceInterface;
import com.supmti.productsapi.service.api.ProductServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/products")
public class ProductResources {

    @Autowired
    ProductServiceInterface productServiceInterface;

    @Autowired
    AuthServiceInterface authServiceInterface;

    @GetMapping(value = "/hello")
    public ResponseEntity helloWorld() throws Exception {

        return ResponseEntity.status(HttpStatus.CREATED).body("HelloWorld");

    }


    @GetMapping()
    public ResponseEntity<List<ProductDTO>> get(@RequestHeader("login") String login,
                                                @RequestHeader("password") String password)
    {

            return ResponseEntity.status(HttpStatus.CREATED).body(productServiceInterface.getAll());



    }

    @GetMapping("/{product_id}")
    private Optional<Product> getById(@PathVariable("product_id") Long product_id)
    {
        return productServiceInterface.find(product_id);
    }


    @DeleteMapping("/{product_id}")
    private ResponseEntity<String> delete(@PathVariable("product_id") Long product_id) throws Exception {
        try {

            productServiceInterface.delete(product_id);
            return new ResponseEntity<>("resource deleted successfully", HttpStatus.ACCEPTED);

        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }
    }



    @PostMapping("/product")
    private ResponseEntity<ProductDTO> save(@RequestBody ProductDTO productDTO,
                                            @RequestHeader("login") String login,
                                            @RequestHeader("password") String password)
                                                throws Exception {

        if(authServiceInterface.authUser(login,password))
        {
            productServiceInterface.add(productDTO,login,password);
        }
       else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(productDTO, HttpStatus.OK);
    }



    @PutMapping("/{product}")
    public ResponseEntity<ProductDTO> update(@RequestBody ProductDTO productDTO) {
        try {
            return new ResponseEntity<>(productServiceInterface.update(productDTO), HttpStatus.ACCEPTED);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, e.getMessage());
        }
    }

}
