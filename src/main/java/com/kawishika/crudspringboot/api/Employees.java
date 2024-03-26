package com.kawishika.crudspringboot.api;

import com.kawishika.crudspringboot.dto.EmployeeDTO;
import com.kawishika.crudspringboot.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
@RequiredArgsConstructor
public class Employees {
    private final EmployeeService employeeService;

    @GetMapping("/{id}")
    EmployeeDTO getEmployee(@PathVariable String id) {
        return employeeService.getEmployee(id);
    }

    @GetMapping
    List<EmployeeDTO> getEmployees() {
        return employeeService.getEmployees();
    }

    @PutMapping
    EmployeeDTO updateEmployee(@RequestBody EmployeeDTO employeeDTO) {
        return employeeService.updateEmployee(employeeDTO);
    }

    @DeleteMapping("/{id}")
    void deleteEmployee(@PathVariable String id) {
        employeeService.deleteEmployee(id);
    }

    @PostMapping
    void saveEmployee(@RequestBody EmployeeDTO employeeDTO) {
        employeeService.saveEmployee(employeeDTO);
    }
}
