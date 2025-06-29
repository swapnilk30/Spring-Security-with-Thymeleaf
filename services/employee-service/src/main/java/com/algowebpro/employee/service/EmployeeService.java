package com.algowebpro.employee.service;

import com.algowebpro.employee.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {

    // Create a new employee
    EmployeeDto createEmployee(EmployeeDto employeeDto);
    // Get all employees
    List<EmployeeDto> getAllEmployees();
}
