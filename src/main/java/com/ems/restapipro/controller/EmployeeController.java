package com.ems.restapipro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ems.restapipro.entity.Employee;
import com.ems.restapipro.service.EmployeeService;

@RestController
@CrossOrigin(origins="http://localhost:4200/")
public class EmployeeController {

		@Autowired
		private EmployeeService eservice;
		@PostMapping("/saveemployee")
		public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee, EmployeeService eservice)
		{
			System.out.println(employee);
			
			return new ResponseEntity<Employee>(eservice.saveEmployee(employee),HttpStatus.OK);
		}
		
		@GetMapping("/getallemployees")
		public List<Employee> getAllEmployee(){
			return eservice.getallEmployee();
		}
		@GetMapping("/msg")
		public String getMessage() {
		return "hello";
		}
		
}
