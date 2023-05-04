package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Employee;
import com.example.service.IEmployeeService;

import org.springframework.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/")
public class EmplyeeController {

	@Autowired
	IEmployeeService iEmployeeService;

	@GetMapping
	public ResponseEntity<Employee> getEmployee(Integer id) {
		
		Employee emp = iEmployeeService.findEmpById(id);
		
		return ResponseEntity.ok().body(emp);
	}

	@PostMapping
	public ResponseEntity<Employee> saveEmployee(Employee emp) {

		Employee empPosted = iEmployeeService.saveEmp(emp);

		return ResponseEntity.ok().body(empPosted);
	}

}
