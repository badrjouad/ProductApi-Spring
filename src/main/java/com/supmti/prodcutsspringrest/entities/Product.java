package com.supmti.prodcutsspringrest.entities;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Table(name="products")
@Entity
public class Product implements Serializable {
	

	@Getter
	@Setter
	@Id
	@GeneratedValue
	private long id;
	

	@Getter
	@Setter
	@NotNull
	@Size(min=5, max=255)
	private String designation;
	

	@Getter
	@Setter
	@DecimalMin("100")
	private double price;

	public Product	(@NotNull @Size(min = 5, max = 255) String designation, @DecimalMin("100") double price) {
		this.designation = designation;
		this.price = price;
	}

	public Product() {
		this.designation = "";
		this.price = 0.0;
	}


	
}
