package com.departmentservice.controller;

import com.departmentservice.payload.DepartmentDto;

import com.departmentservice.service.DepartmentService;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@NoArgsConstructor
@RequestMapping("/api/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    //http://localhost:8081/api/departments
    @PostMapping
    public ResponseEntity<DepartmentDto> saveDepartment(@RequestBody DepartmentDto departmentDto){
        DepartmentDto savedDepartment = departmentService.saveDepartment(departmentDto);
        return new ResponseEntity<>(savedDepartment, HttpStatus.CREATED);
    }
    //http://localhost:8081/api/departments/{departmentCode}
    @GetMapping("/{departmentCode}")
    public ResponseEntity<DepartmentDto> getDepartmentByDepartmentCode(@PathVariable String departmentCode){
        DepartmentDto departmentByCode = departmentService.getDepartmentByCode(departmentCode);
        return new  ResponseEntity<>(departmentByCode,HttpStatus.OK);
    }
}
