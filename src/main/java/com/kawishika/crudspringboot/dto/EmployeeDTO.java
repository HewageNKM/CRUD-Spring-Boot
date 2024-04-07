package com.kawishika.crudspringboot.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeDTO {

    private UUID id;
    @NotEmpty(message = "First Name Should Not Be Empty")
    private String firstName;

    @NotEmpty(message = "Last Name Should Not Be Empty")
    private String lastName;

    @NotEmpty(message = "Position Should Not Be Empty")
    private String position;

    @NotEmpty(message = "Address Should Not Be Empty")
    private String address;

    @NotEmpty(message = "Mobile Number Should Not Be Empty")
    @Size(min = 10, max = 12, message = "Mobile Should Be 07XXXXXXXX Or +XXXXXXXXXXXX")
    private String mobileNumber;

    @Email
    private String email;
}
