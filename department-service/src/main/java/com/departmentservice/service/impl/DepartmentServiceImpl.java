package com.departmentservice.service.impl;

import com.departmentservice.entity.Department;
import com.departmentservice.payload.DepartmentDto;
import com.departmentservice.payload.DepartmentMapper;
import com.departmentservice.repository.DepartmentRepository;
import com.departmentservice.service.DepartmentService;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public DepartmentDto saveDepartment(DepartmentDto departmentDto) {
        Department department = DepartmentMapper.departmentDtoToDepartment(departmentDto);
        Department savedDepartment = departmentRepository.save(department);
         return DepartmentMapper.departmentToDepartmentDto(savedDepartment);
    }

    @Override
    public DepartmentDto getDepartmentByCode(String departmentCode) {
        Department department = departmentRepository.findByDepartmentCode(departmentCode);
        return DepartmentMapper.departmentToDepartmentDto(department);
    }
}
