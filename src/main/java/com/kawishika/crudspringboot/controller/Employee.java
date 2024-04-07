package com.kawishika.crudspringboot.controller;

import com.kawishika.crudspringboot.dto.EmployeeDTO;
import com.kawishika.crudspringboot.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/api/v1/employees")
@RequiredArgsConstructor
public class Employee {
    private final EmployeeService employeeService;

    @GetMapping
    public String sendEmployees(Model model) {
        List<EmployeeDTO> employees = employeeService.getEmployees();
        model.addAttribute("theDate", LocalDate.now());
        model.addAttribute("employees",employees);
        return "/employee/employees";
    }

    @PostMapping
    public String saveEmployee(@ModelAttribute("employee") EmployeeDTO employeeDTO){
        employeeService.saveEmployee(employeeDTO);
        return "redirect:/api/v1/employees";
    }

    @GetMapping("/update/{id}")
    public String updateEmployee(@PathVariable UUID id, Model model){
        EmployeeDTO employee = employeeService.getEmployee(id);
        model.addAttribute("employee",employee);
        return "/employee/employeeAddForm";
    }
    @GetMapping("/add")
    public String sendEmployeeAddForm(Model model) {
        model.addAttribute("theDate", LocalDate.now());
        model.addAttribute("employee",new EmployeeDTO());
        return "/employee/employeeAddForm";
    }

    @GetMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable UUID id) {
        employeeService.deleteEmployee(id);
        return "redirect:/api/v1/employees";
    }

}
