package com.abhi.docker.basic_docker_app.model;

import lombok.Data;

// Creating an entity Employee 
@Data
public class Employee {

    public Employee() {
    }

    // Parameterized Constructor
    // to assign the values
    // to the properties of
    // the entity
    public Employee(
            Integer id, String firstName,
            String lastName, String email) {

        super();

        this.id = id;

        this.firstName = firstName;

        this.lastName = lastName;

        this.email = email;

    }

    private Integer id;

    private String firstName;

    private String lastName;

    private String email;

    // Overriding the toString method
    // to find all the values
    @Override
    public String toString() {

        return "Employee [id="
                + id + ", firstName="
                + firstName + ", lastName="
                + lastName + ", email="
                + email + "]";

    }
}
