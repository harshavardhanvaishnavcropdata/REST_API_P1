package com.example.model;

import lombok.Data;

@Data
public class Product {

	public Product(Integer productCode, String productName, String productDescription, Integer quantityInStock,
			Float price) {
		super();
		this.productCode = productCode;
		this.productName = productName;
		this.productDescription = productDescription;
		this.quantityInStock = quantityInStock;
		this.price = price;
	}

	public Product() {
		super();
	}

	private Integer Id;

	private Integer productCode;

	private String productName;

	private String productDescription;

	private Integer quantityInStock;
	
	private Float price;
	
	

}
