package com.example.model;

import lombok.Data;

@Data
public class Customer {

	private Integer customerNumber;

	private String customerFirstName;

	private String customerLastName;

	private Integer phone;

	private String addressLine1;

	private String addressLine2;

	private String city;

	private String state;

	private String postalCode;

	private String country;

	public Customer(Integer customerNumber, String customerFirstName, String customerLastName, Integer phone,
			String addressLine1, String addressLine2, String city, String state, String postalCode, String country) {
		super();
		this.customerNumber = customerNumber;
		this.customerFirstName = customerFirstName;
		this.customerLastName = customerLastName;
		this.phone = phone;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
		this.country = country;
	}

	public Customer() {
		super();
	}  
	
	

}
