package com.example.Entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import lombok.Data;

@Entity
@Table
@Data
public class ProductEntity {
	@Column
	private Integer Id;
	@Column
	private Integer productCode;
	@Column
	private String productName;
	@Column
	private String productDescription;
	@Column
	private Integer quantityInStock;
	@Column
	private Float price;
	
	

}
