package com.kawishika.crudspringboot.service;

import com.kawishika.crudspringboot.dao.EmployeeRepository;
import com.kawishika.crudspringboot.dto.EmployeeDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class EmployeeServiceImpl implements EmployeeService{
    private final EmployeeRepository employeeRepository;

    @Override
    public List<EmployeeDTO> getEmployees() {
        return null;
    }

    @Override
    public EmployeeDTO getEmployee(String id) {
        return null;
    }

    @Override
    public void deleteEmployee(String id) {

    }

    @Override
    public void saveEmployee(EmployeeDTO employeeDTO) {

    }

    @Override
    public EmployeeDTO updateEmployee(EmployeeDTO employeeDTO) {
        return null;
    }
}
