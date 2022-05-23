package com.supmti.productsapi.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class ProductDTO {
    private Long id;
    private String designation;
    private double price;
    private int quantity;
}
