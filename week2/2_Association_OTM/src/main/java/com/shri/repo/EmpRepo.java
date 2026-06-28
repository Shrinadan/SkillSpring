package com.shri.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shri.entity.Employee;

public interface EmpRepo extends JpaRepository<Employee, Integer> {

}
