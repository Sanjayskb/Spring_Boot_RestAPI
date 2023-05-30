package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Employee;

// Repo extending JPA for DP Operations
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
