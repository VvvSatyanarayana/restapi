package com.ems.restapipro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.restapipro.entity.Employee;
import com.ems.restapipro.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository erepo;
	public Employee saveEmployee(Employee emp) {
		return erepo.save(emp);
	}
	public List<Employee> getallEmployee() {
		// TODO Auto-generated method stub
		return (List<Employee>) erepo.findAll();
	}
}
