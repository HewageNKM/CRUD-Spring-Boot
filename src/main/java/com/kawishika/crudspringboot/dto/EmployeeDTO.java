package com.kawishika.crudspringboot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeDTO {
    private String id;
    private String firstName;
    private String lastName;
    private String position;
    private String address;
    private String mobileNumber;
    private String email;
}
