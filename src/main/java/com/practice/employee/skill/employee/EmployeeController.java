package com.practice.employee.skill.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> retrieveAllEmployees(){
        return employeeService.listOfAllEmployees();
    }

    @PostMapping("/employees")
    public void addEmployee(Employee employee){
        employeeService.addEmployee(employee);
    }

    @GetMapping("/employees/{id}")
    public Employee retrieveEmployee(@PathVariable String id){
        return employeeService.getEmployee(id);
    }

    @PutMapping("/employees/{id}")
    public void updateEmployee(@PathVariable String id, @RequestBody Employee employee){
        employeeService.updateEmployee(id, employee);
    }

    @DeleteMapping("/employees/{id}")
    public void deleteEmployee(@PathVariable String id, @RequestBody Employee employee){
        employeeService.deleteEmployee(employee);

    }


}
