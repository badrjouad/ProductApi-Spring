package com.supmti.productsapi.mapper;

import com.supmti.productsapi.entity.Product;
import com.supmti.productsapi.dto.ProductDTO;
import fr.xebia.extras.selma.IgnoreMissing;
import fr.xebia.extras.selma.IoC;
import fr.xebia.extras.selma.Mapper;

import java.util.Arrays;
import java.util.List;

@Mapper(withIoC = IoC.SPRING, withIgnoreMissing = IgnoreMissing.ALL, withIgnoreNullValue = true)
public interface   ProductMapper {

     Product asProduct(ProductDTO productDTO);
     ProductDTO asProductDTO(Product product);


     List<ProductDTO> asProductDTO(List<Product> products) ;
}