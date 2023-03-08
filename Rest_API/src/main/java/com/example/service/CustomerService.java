package com.example.service;

import java.util.List;
import com.example.model.Customer;

public interface CustomerService {

	List<Customer> getCustomerList();

	Customer updateCustomer(Integer customerNumber);

	String deleteCustomer(Integer customerNumber);

	Customer findCustomer(Integer Integer);

	Customer addCustomer(Integer customerNumber, String customerFirstName, String customerLastName, Integer phone,
			String addressLine1, String addressLine2, String city, String state, String postalCode, String country);

}
