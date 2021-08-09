package com.epex.employee.repository;

import com.epex.employee.models.EmployeeDTO;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "emp_master")
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(name = "country_code", nullable = false)
    private String countryCode;
    @Column(nullable = false, unique = true)
    private String phone;
    @Column(name = "emp_id", nullable = false, unique = true)
    private String employeeId;
    @Column(name = "office_id", nullable = false)
    private String officeId;

    public Employee(EmployeeDTO dto) {
        this.setFirstName(dto.getFirstName());
        this.setLastName(dto.getLastName());
        this.setEmail(dto.getEmail());
        this.setCountryCode(dto.getCountryCode());
        this.setPhone(dto.getPhone());
        this.setEmployeeId(dto.getEmployeeId());
        this.setOfficeId(dto.getOfficeId());
    }
}
