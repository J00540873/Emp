package com.practice.employee.skill.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> listOfAllEmployees(){
        List<Employee> employeeList = new ArrayList<>();
        employeeRepository.findAll().forEach(employeeList::add);
        return employeeList;
    }

    public Employee getEmployee(String id){
        return employeeRepository.findById(id).orElseThrow(() -> new EmployeeNotFoundException(id));
    }

    public void addEmployee(Employee employee){
        employeeRepository.save(employee);
    }


    public void updateEmployee(String id, Employee employee){
        employeeRepository.save(employee);
    }

    public void deleteEmployee(Employee employee){
        employeeRepository.delete(employee);
    }

}
