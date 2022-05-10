package com.supmti.prodcutsspringrest.service.impl;

import com.supmti.prodcutsspringrest.dao.api.ProductDAO;
import com.supmti.prodcutsspringrest.entities.Product;
import com.supmti.prodcutsspringrest.service.api.ProductServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements ProductServiceInterface {

    @Autowired
    ProductDAO productDAO;

    public List<Product> getProducts()
    {
       return productDAO.getProducts();
    }


}
