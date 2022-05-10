package com.supmti.prodcutsspringrest.controller;

import com.supmti.prodcutsspringrest.dao.api.ProductDAO;
import com.supmti.prodcutsspringrest.dao.mapper.ProductMapper;
import com.supmti.prodcutsspringrest.entities.Product;
import com.supmti.prodcutsspringrest.service.api.ProductServiceInterface;
import com.supmti.prodcutsspringrest.service.impl.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/store")
public class ProductRessources {

    @Autowired
    ProductService productService;




    @PostMapping(value = "/products")
    public ResponseEntity doGet() throws Exception {

        return ResponseEntity.status(HttpStatus.CREATED).body(productService.getProducts());

    }




}
