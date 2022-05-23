package com.supmti.productsapi.service.impl;

import com.supmti.productsapi.dao.ProductRepository;
import com.supmti.productsapi.entity.Product;
import com.supmti.productsapi.dto.ProductDTO;
import com.supmti.productsapi.mapper.ProductMapper;
import com.supmti.productsapi.service.api.ProductServiceInterface;
import fr.xebia.extras.selma.Selma;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductServiceInterface {

    @Autowired
    ProductRepository productRepository;


    @Override
    public List<ProductDTO> getAllProducts() {

        //Build Product Mapper
        ProductMapper productMapper = Selma.builder(ProductMapper.class).build();

        //Clone Result list of Entity product  to list of product Dto and retutn it
        return  productMapper.asProductDTO(productRepository.findAll());

    }

    @Override
    public Optional<Product> finProductById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public void deleteProductById(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public ProductDTO addProduct(ProductDTO productDTO) {
        //Build Product Mapper
        ProductMapper productMapper = Selma.builder(ProductMapper.class).build();

        //Clone product Dto Request to product Entity
        Product product = productMapper.asProduct(productDTO);
        //Clone Result product Entity to product Dto and retutn it
        return  productMapper.asProductDTO(productRepository.save(product));
    }


}
