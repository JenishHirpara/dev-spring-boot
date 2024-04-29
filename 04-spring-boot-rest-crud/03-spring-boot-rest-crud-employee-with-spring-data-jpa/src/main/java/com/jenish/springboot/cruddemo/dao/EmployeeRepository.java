package com.jenish.springboot.cruddemo.dao;

import com.jenish.springboot.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    // thats it... no need to write any code
}
