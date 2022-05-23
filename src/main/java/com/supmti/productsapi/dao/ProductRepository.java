package com.supmti.productsapi.dao;

import com.supmti.productsapi.dto.ProductDTO;
import com.supmti.productsapi.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product,Long> {



}
