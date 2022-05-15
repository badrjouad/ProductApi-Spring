package com.supmti.productsapi.controller;


import com.supmti.productsapi.service.api.ProductServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
public class ProductResources {

    @Autowired
    ProductServiceInterface productServiceInterface;

    @GetMapping(value = "/hello")
    public ResponseEntity helloWorld() throws Exception {

        return ResponseEntity.status(HttpStatus.CREATED).body("HelloWorld");

    }


    @GetMapping(value = "/list")
    public ResponseEntity doGet() throws Exception {

        return ResponseEntity.status(HttpStatus.CREATED).body(productServiceInterface.getAllProducts());

    }

    @DeleteMapping("/product/{product_id}")
    private void deleteProduct(@PathVariable("product_id") Long product_id)
    {
        productServiceInterface.finProductById(product_id);
    }

}
