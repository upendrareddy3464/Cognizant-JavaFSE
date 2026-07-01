package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmployeeTest {
    Employee employee;
    @BeforeEach
    public void setUp() {
        System.out.println("Setup Method");
        employee = new Employee();
    }
    @AfterEach
    public void tearDown() {
        System.out.println("Teardown Method");
        employee = null;
    }
    @Test
    public void testCalculateSalary() {
        int basic = 25000;
        int bonus = 5000;
        int salary = employee.calculateSalary(basic, bonus);
        assertEquals(30000, salary);
    }
}