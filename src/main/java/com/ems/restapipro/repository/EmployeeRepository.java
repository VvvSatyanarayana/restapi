package com.ems.restapipro.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ems.restapipro.entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Integer>{

}
