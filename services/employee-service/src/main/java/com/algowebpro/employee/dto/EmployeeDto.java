package com.algowebpro.employee.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {

    private Long id;

    //@NotBlank(message = "First name is required")
    //@Size(min = 2, max = 50, message = "First name must be between 2 and 50 characters")
    private String firstName;
}
