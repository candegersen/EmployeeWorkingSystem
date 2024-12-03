package com.workingsystem.EmployeeWorkingSystem.controller;

import com.workingsystem.EmployeeWorkingSystem.entity.Employee;
import com.workingsystem.EmployeeWorkingSystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class EmployeeViewController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeViewController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public String viewEmployees(Model model) {
        List<Employee> employees = employeeService.getAllEmployees();
        System.out.println("Employees: " + employees);
        model.addAttribute("employees", employees);
        return "employees";
    }
}
