package com.algowebpro.employee.lomboktest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TestLombok {


    private Long id;
    private String name;
    private String email;


    public static void main(String[] args) {

        TestLombok obj2 = new TestLombok(1L, "Test Name", "test@example.com");

        System.out.println(obj2.toString());
    }
}
