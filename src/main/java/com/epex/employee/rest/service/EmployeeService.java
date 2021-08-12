package com.epex.employee.rest.service;

import com.epex.employee.models.EmployeeDTO;
import com.epex.employee.repository.Employee;
import com.epex.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public EmployeeDTO createEmployee(EmployeeDTO dto) {
        Employee persistedEmployee = employeeRepository.save(new Employee(dto));
        return new EmployeeDTO(persistedEmployee);
    }

    public EmployeeDTO getEmployee(Long id) throws Exception {
        Employee queriedEmployee = employeeRepository.findById(id)
                .orElseThrow(() -> new Exception("Employee With Given Id Not Found !"));
        return new EmployeeDTO(queriedEmployee);
    }

}
