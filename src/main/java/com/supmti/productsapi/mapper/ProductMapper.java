package com.supmti.productsapi.mapper;

import com.supmti.productsapi.entity.Product;
import com.supmti.productsapi.entity.dto.ProductDTO;
import fr.xebia.extras.selma.Mapper;

@Mapper
public interface ProductMapper {

    // Returns a new instance of PersonDTO mapped from Person source
    ProductDTO asProductDTO(Product product);


}