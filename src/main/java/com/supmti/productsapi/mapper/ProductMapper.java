package com.supmti.productsapi.mapper;

import com.supmti.productsapi.entity.Product;
import com.supmti.productsapi.dto.ProductDTO;
import fr.xebia.extras.selma.IgnoreMissing;
import fr.xebia.extras.selma.IoC;
import fr.xebia.extras.selma.Mapper;

import java.util.Arrays;
import java.util.List;

@Mapper(withIoC = IoC.SPRING, withIgnoreMissing = IgnoreMissing.ALL, withIgnoreNullValue = true)
public abstract class  ProductMapper {

    public abstract Product asProduct(ProductDTO productDTO);
    public abstract ProductDTO asProductDTO(Product product);


    public List<ProductDTO> asProductDTO(List<Product> products) {

        if (products == null)
        {
            return null;
        }

        Product[] ArrayProduct = products.toArray(new Product[0]);

        ProductDTO[] ArrayProductDTO = Arrays.stream(ArrayProduct).map(this::asProductDTO).toArray(ProductDTO[]::new);



        return Arrays.asList(ArrayProductDTO);
    };
}