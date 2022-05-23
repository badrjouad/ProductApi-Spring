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
    public List<ProductDTO> get() {


        ProductMapper productMapper = Selma.builder(ProductMapper.class).build();

        // as product DTO list
        return  productMapper.asProductDTO(productRepository.findAll());

    }

    @Override
    public Optional<Product> find(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public void delete(Long id) throws Exception {
        Product product = productRepository.getById(id) ;
        if (product== null)
        {
            throw new Exception("Product not found");
        }
        productRepository.delete(product);
    }

    @Override
    public ProductDTO add(ProductDTO productDTO) throws Exception {
        if(productDTO.getQuantity()<1)
        {
            throw new Exception("Quantity must be greater than zero");
        }

        ProductMapper productMapper = Selma.builder(ProductMapper.class).build();

        // as product DTO object
        Product product = productMapper.asProduct(productDTO);

        return  productMapper.asProductDTO(productRepository.saveAndFlush(product));
    }

    @Override
    public ProductDTO update(ProductDTO productDTO) throws Exception {

        ProductMapper productMapper = Selma.builder(ProductMapper.class).build();

        // as product DTO object
        Product product = productMapper.asProduct(productDTO);


        return  productMapper.asProductDTO(productRepository.save(product));
    }


}
