package com.supmti.productsapi.controller;


import com.supmti.productsapi.entity.Product;
import com.supmti.productsapi.service.api.ProductServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/products")
public class ProductResources {

    @Autowired
    ProductServiceInterface productServiceInterface;

    @GetMapping(value = "/hello")
    public ResponseEntity helloWorld() throws Exception {

        return ResponseEntity.status(HttpStatus.CREATED).body("HelloWorld");

    }


    @GetMapping(value = "/getAll")
    public ResponseEntity get() throws Exception {

        return ResponseEntity.status(HttpStatus.CREATED).body(productServiceInterface.getAllProducts());

    }

    @GetMapping("/get/{product_id}")
    private Optional<Product> getById(@PathVariable("product_id") Long product_id)
    {
        return productServiceInterface.finProductById(product_id);
    }
    @DeleteMapping("/delete/{product_id}")
    private void delete(@PathVariable("product_id") Long product_id)
    {
        productServiceInterface.deleteProductById(product_id);
    }
    @PostMapping("/save")
    private Product save(@RequestBody Product product)
    {
        productServiceInterface.addProduct(product);
        return product;
    }

}
