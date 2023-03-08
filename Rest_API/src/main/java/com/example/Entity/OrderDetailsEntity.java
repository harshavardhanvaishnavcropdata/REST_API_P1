package com.example.Entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import lombok.Data;

import javax.persistence.Column;

@Entity
@Table
@Data
public class OrderDetailsEntity {

	@Column
	private Integer orderNumber;
	@Column
	private Integer productCode;
	@Column
	private Integer quantityOrdered;
	@Column
	private Float priceEach;
	
	
	
}
