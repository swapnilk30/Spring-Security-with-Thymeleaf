package com.algowebpro.employee.controller;

import com.algowebpro.employee.dto.EmployeeDto;
import com.algowebpro.employee.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/employees")
//@RequiredArgsConstructor
public class EmployeeViewController {

    private static final Logger logger = LoggerFactory.getLogger(EmployeeViewController.class);

    private final EmployeeService employeeService;

    public EmployeeViewController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @GetMapping
    public String listEmployees(Model model) {
        logger.info("Request received to list all employees");
        List<EmployeeDto> employees = employeeService.getAllEmployees();
        logger.debug("Retrieved {} employees from service", employees.size());
        model.addAttribute("employees", employees);
        return "employees/list";
    }
}
