package com.example.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Employee;
import com.example.repository.IEmployeeRepo;
import com.example.service.IEmployeeService;


@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	IEmployeeRepo iEmployeeRepo;

	@Override
	public Employee findEmpById(Integer id) {
		Employee findById = iEmployeeRepo.findById(id).orElse(null);
		return findById;
	}

	@Override
	public Employee saveEmp(Employee emp) {
		Employee savedEmp = iEmployeeRepo.save(emp);
		return savedEmp;
	}

}
