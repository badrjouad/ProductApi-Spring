package com.supmti.productsapi.service.api;

import com.supmti.productsapi.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductServiceInterface {

    List<Product> getAllProducts();
    Optional<Product> finProductById(Long id);


}