package com.example.service;

import com.example.entity.Employee;

public interface IEmployeeService {
 
	public Employee findEmpById(Integer id);

	public Employee saveEmp(Employee emp);
     
}
