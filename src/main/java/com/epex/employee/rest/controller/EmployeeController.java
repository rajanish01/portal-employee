package com.epex.employee.rest.controller;

import com.epex.employee.models.EmployeeDTO;
import com.epex.employee.rest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(final EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/find")
    @ResponseBody
    public ResponseEntity<?> findEmployee(@RequestParam Long id) {
        try {
            return ResponseEntity.ok(employeeService.getEmployee(id));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping("/create")
    @ResponseBody
    public ResponseEntity<?> createEmployee(@RequestBody @Valid EmployeeDTO employeeDTO) {
        try {
            return ResponseEntity.ok(employeeService.createEmployee(employeeDTO));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

}
