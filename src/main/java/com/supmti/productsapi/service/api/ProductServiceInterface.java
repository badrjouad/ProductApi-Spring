package com.supmti.productsapi.service.api;

import com.supmti.productsapi.entity.Product;
import com.supmti.productsapi.entity.dto.ProductDTO;

import java.util.List;
import java.util.Optional;

public interface ProductServiceInterface {

    List<ProductDTO> getAllProducts();
    Optional<Product> finProductById(Long id);
    void deleteProductById(Long id);
    Product addProduct(Product product);


}
