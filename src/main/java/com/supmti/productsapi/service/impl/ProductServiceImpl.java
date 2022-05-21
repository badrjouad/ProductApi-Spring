package com.supmti.productsapi.service.impl;

import com.supmti.productsapi.dao.ProductDAO;
import com.supmti.productsapi.entity.Product;
import com.supmti.productsapi.entity.dto.ProductDTO;
import com.supmti.productsapi.service.api.ProductServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductServiceInterface {

    @Autowired
    ProductDAO productDAO;


    @Override
    public List<ProductDTO> getAllProducts() {

            List<ProductDTO> productDTOS =new ArrayList<ProductDTO>();
            return  productDTOS;

    }

    @Override
    public Optional<Product> finProductById(Long id) {
        return productDAO.findById(id);
    }

    @Override
    public void deleteProductById(Long id) {
        productDAO.deleteById(id);
    }

    @Override
    public Product addProduct(Product product) {
        return  productDAO.save(product);
    }


}
