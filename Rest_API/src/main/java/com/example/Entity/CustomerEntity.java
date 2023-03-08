package com.example.Entity;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import lombok.Data;

@Entity
@Table
@Data
public class CustomerEntity {

	@Column
	private Integer customerNumber;
	@Column
	private String customerFirstName;
	@Column
	private String customerLastName;
	@Column(Precision=10)
	private Integer phone;
	@Column
	private String addressLine1;
	@Column
	private String addressLine2;
	@Column
	private String city;
	@Column
	private String state;
	@Column
	private Integer postalCode;
	@Column
	private String country;

	
}
