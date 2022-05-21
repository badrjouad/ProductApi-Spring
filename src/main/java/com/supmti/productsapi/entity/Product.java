package com.supmti.productsapi.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "products")
public class Product {

    @Id
    private Long id_product;
    private String designation;
    private double price;
    private double ventes;
}
