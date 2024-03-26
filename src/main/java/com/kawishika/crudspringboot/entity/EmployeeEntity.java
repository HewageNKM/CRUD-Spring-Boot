package com.kawishika.crudspringboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeEntity {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String position;
    private String address;
    private String mobileNumber;
    private String email;
}
