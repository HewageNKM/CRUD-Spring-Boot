package com.kawishika.crudspringboot.service;

import com.kawishika.crudspringboot.dto.EmployeeDTO;

import java.util.List;

public interface EmployeeService {
    List<EmployeeDTO> getEmployees();
    EmployeeDTO getEmployee(String id);
    void deleteEmployee(String id);
    void saveEmployee(EmployeeDTO employeeDTO);
    EmployeeDTO updateEmployee(EmployeeDTO employeeDTO);

}
