package com.algowebpro.employee.service.impl;

import com.algowebpro.employee.dto.EmployeeDto;
import com.algowebpro.employee.model.Employee;
import com.algowebpro.employee.repository.EmployeeRepository;
import com.algowebpro.employee.service.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        // Convert DTO to Entity
        Employee employee = modelMapper.map(employeeDto, Employee.class);
        // Save Entity
        Employee savedEmployee = employeeRepository.save(employee);
        // Convert Entity to DTO and return
        return modelMapper.map(savedEmployee, EmployeeDto.class);
    }

    @Override
    public List<EmployeeDto> getAllEmployees() {

        List<Employee> employees = employeeRepository.findAll();
        return employees.stream().map(employee -> modelMapper.map(employee,EmployeeDto
                .class)).collect(Collectors.toList());
    }
}
