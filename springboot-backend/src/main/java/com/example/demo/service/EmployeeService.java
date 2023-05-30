package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Employee;

//Service Interface  for controller to DP Connectivity
public interface EmployeeService {
	Employee saveEmployee(Employee employee);
	List<Employee> getAllEmployee();
	Employee findEmployeeById(long id);
	Employee updateEmployee(Employee employee, long id);
	void deleteEmployee(long id);
}
