package com.example.model;

import lombok.Data;

@Data
public class OrderDetails {

	public OrderDetails(Integer orderNumber, Integer productCode, Integer quantityOrdered, Float priceEach) {
		super();
		this.orderNumber = orderNumber;
		this.productCode = productCode;
		this.quantityOrdered = quantityOrdered;
		this.priceEach = priceEach;
	}

	private Integer orderNumber;
	private Integer productCode;
	private Integer quantityOrdered;
	private Float priceEach;

	public OrderDetails() {
		super();
	}

}
