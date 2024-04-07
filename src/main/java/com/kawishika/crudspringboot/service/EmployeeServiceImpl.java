package com.kawishika.crudspringboot.service;

import com.kawishika.crudspringboot.dao.EmployeeRepository;
import com.kawishika.crudspringboot.dto.EmployeeDTO;
import com.kawishika.crudspringboot.entity.Employee;
import com.kawishika.crudspringboot.util.Converter;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{
    private final EmployeeRepository employeeRepository;
    private final Converter converter;


    @Override
    public List<EmployeeDTO> getEmployees() {
        return converter.convertToListDto(employeeRepository.findAll(), EmployeeDTO.class);
    }

    @Override
    public EmployeeDTO getEmployee(UUID id) {
        return converter.convertToDto(employeeRepository.findById(id), EmployeeDTO.class);
    }

    @Override
    public void deleteEmployee(UUID id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public void saveEmployee(EmployeeDTO employeeDTO) {
        Employee employee = converter.convertToEntity(employeeDTO, Employee.class);
        employeeRepository.save(employee);
    }
}
