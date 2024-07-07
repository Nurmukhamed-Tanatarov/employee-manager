package com.example.employeemanager.entityModel;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private double salary;
    private String email;
    private String jobTitle;
    private String phoneNumber;
    private String imageURL;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", email='" + email + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", imageURL='" + imageURL + '\'' +
                '}';
    }
}
