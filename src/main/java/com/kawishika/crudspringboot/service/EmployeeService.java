package com.kawishika.crudspringboot.service;

import com.kawishika.crudspringboot.dto.EmployeeDTO;

import java.util.List;
import java.util.UUID;

public interface EmployeeService {
    List<EmployeeDTO> getEmployees();
    EmployeeDTO getEmployee(UUID id);
    void deleteEmployee(UUID id);
    void saveEmployee(EmployeeDTO employeeDTO);
}
