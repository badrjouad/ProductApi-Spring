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
    private Long id;
    private String designation;
    private double price;
    private double ventes;
    private int quantity;
    private String description;
    private String utilisation;
    private int rating;
    private boolean inStock;
}
