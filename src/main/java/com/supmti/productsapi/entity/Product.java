package com.supmti.productsapi.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "products")
public class Product {

    @Id
    @Getter
    @Setter
    private Long id_product;

    @Getter
    @Setter
    private String designation;

    @Getter
    @Setter
    private double price;
}
