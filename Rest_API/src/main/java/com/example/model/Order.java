package com.example.model;

import java.util.Date;

import lombok.Data;

@Data
public class Order {

	private Integer orderNumber;
	private Date orderDate;
	private Integer shippedDate;
	private String status;
	private String comments;
	private Integer customerNumber;

	public Order(Integer orderNumber, Date orderDate, Integer shippedDate, String status, String comments,
			Integer customerNumber) {
		super();
		this.orderNumber = orderNumber;
		this.orderDate = orderDate;
		this.shippedDate = shippedDate;
		this.status = status;
		this.comments = comments;
		this.customerNumber = customerNumber;
	}

	public Order() {
		super();
	}

}
