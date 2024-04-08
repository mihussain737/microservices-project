package com.employeeservice.service;

import com.employeeservice.payload.APIResponseDto;
import com.employeeservice.payload.EmployeeDto;

public interface EmployeeService {

    public EmployeeDto saveEmployee(EmployeeDto employeeDto);

    APIResponseDto getEmployeeById(Long id);
}
