package com.example.Entity;
import javax.persistence.Entity;
import javax.persistence.Table;

import java.util.Date;

import javax.persistence.Column;

import lombok.Data;


@Entity
@Table
@Data
public class OrderEntity {
	@Column
	private Integer orderNumber;
	@Column
	private Date orderDate;
	@Column
	private Data shippedDate;
	@Column
	private String status;
	@Column
	private String comments;
	@Column
	private Integer customerNumber;
	
	
}
