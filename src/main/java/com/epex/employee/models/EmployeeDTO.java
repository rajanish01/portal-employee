package com.epex.employee.models;

import com.epex.employee.repository.Employee;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
public class EmployeeDTO {
    private Long id;
    @NotEmpty(message = "First Name Required !")
    private String firstName;
    @NotEmpty(message = "Last Name Required !")
    private String lastName;
    @Email(message = "Valid Email Required !")
    private String email;
    @NotEmpty(message = "Valid Country Code Required !")
    private String countryCode;
    @Size(min = 4, max = 12, message = "Valid Phone Number Required !")
    private String phone;
    @NotEmpty(message = "Employee Id Required !")
    private String employeeId;
    @NotEmpty(message = "Office Id Required !")
    private String officeId;

    public EmployeeDTO(Employee e) {
        this.setId(e.getId());
        this.setFirstName(e.getFirstName());
        this.setLastName(e.getLastName());
        this.setEmail(e.getEmail());
        this.setCountryCode(e.getCountryCode());
        this.setPhone(e.getPhone());
        this.setEmployeeId(e.getEmployeeId());
        this.setOfficeId(e.getOfficeId());
    }
}
