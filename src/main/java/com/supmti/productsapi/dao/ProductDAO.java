package com.supmti.productsapi.dao;

import com.supmti.productsapi.entity.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductDAO extends CrudRepository<Product,Long> {

    List<Product> findAll();
    Optional<Product> findById(Long id);
    void deleteById(Long id);
    Product save(Product product);



}
