package com.practice.employee.skill.employee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {



    private @Id @GeneratedValue String employeeId;
    private String firstName;
    private String lastName;
    private String skill;

    public Employee(String employeeId, String firstName, String lastName, String skill) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.skill = skill;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String  firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}
