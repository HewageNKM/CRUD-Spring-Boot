package com.kawishika.crudspringboot.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.annotation.processing.Generated;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "first_name", nullable = false, length = 20)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 20)
    private String lastName;

    @Column(name = "position", nullable = false, length = 20)
    private String position;

    @Column(name = "address",nullable = false, length = 40)
    private String address;

    @Column(name = "mobile_number",nullable = false,length = 12)
    private String mobileNumber;

    @Column(name = "email")
    private String email;
}
