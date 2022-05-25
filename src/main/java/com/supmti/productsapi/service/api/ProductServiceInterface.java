package com.supmti.productsapi.service.api;

import com.supmti.productsapi.entity.Product;
import com.supmti.productsapi.dto.ProductDTO;

import java.util.List;
import java.util.Optional;

public interface ProductServiceInterface {

    List<ProductDTO> getAll();
    Optional<Product> find(Long id);
    void delete(Long id) throws Exception;
    ProductDTO add(ProductDTO productDTO) throws Exception;
    ProductDTO update(ProductDTO productDTO) throws Exception;



}
