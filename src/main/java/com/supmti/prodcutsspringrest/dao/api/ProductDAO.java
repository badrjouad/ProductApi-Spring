package com.supmti.prodcutsspringrest.dao.api;

import com.supmti.prodcutsspringrest.entities.Product;

import java.util.List;

public interface ProductDAO {
    void createProduct(Product product);

    List<Product> getProducts();

    void deleteProductById(Long id);
}
