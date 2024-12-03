package com.workingsystem.EmployeeWorkingSystem.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.workingsystem.EmployeeWorkingSystem.entity.Employee;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    public Employee addEmployee(Employee employee);

    public boolean deleteEmployee(String id);

    public List<Employee> getAllEmployees();

    public List<Employee> findByDepartment(String department);

}