package com.example.entity;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String fname;
	@Column
	private String lname;
	@Column
	private String address;
	@Column
	private Integer postaCode;
	@Column
	private Integer empId;

}
