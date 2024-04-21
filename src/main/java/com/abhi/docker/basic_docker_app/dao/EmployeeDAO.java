package com.abhi.docker.basic_docker_app.dao;

import org.springframework.stereotype.Repository;

import com.abhi.docker.basic_docker_app.model.Employee;
import com.abhi.docker.basic_docker_app.model.Employees;

@Repository
public class EmployeeDAO {

    private static Employees list = new Employees();

    // This static block is executed
    // before executing the main
    // block
    static {

        // Creating a few employees
        // and adding them to the list
        list.getEmployeeList().add(
                new Employee(
                        1,
                        "Abhishek",
                        "Kumar",
                        "abku@gmail.com"));

        list.getEmployeeList().add(
                new Employee(
                        2, "Vivek",
                        "Kumar",
                        "abc@gmail.com"));

        list.getEmployeeList().add(
                new Employee(
                        3, "Mohit",
                        "Kumar",
                        "asdjf@gmail.com"));

    }

    // Method to return the list
    public Employees getAllEmployees() {

        return list;
    }

    // Method to add an employee
    // to the employees list
    public void addEmployee(Employee employee) {
        list.getEmployeeList()
                .add(employee);

    }
}
