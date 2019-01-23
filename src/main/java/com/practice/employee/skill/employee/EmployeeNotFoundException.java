package com.practice.employee.skill.employee;

public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException(String id){
        super("A problem Occured when retrieving: " + id);
    }
}
