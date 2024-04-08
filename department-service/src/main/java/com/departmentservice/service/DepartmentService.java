package com.departmentservice.service;

import com.departmentservice.payload.DepartmentDto;

public interface DepartmentService {

    public DepartmentDto saveDepartment(DepartmentDto departmentDto);
    public DepartmentDto getDepartmentByCode(String departmentCode);
}
