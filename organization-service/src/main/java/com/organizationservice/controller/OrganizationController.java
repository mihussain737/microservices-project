package com.organizationservice.controller;

import com.organizationservice.payload.OrganizationDto;
import com.organizationservice.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/organizations")
public class OrganizationController {

    @Autowired
    private OrganizationService organizationService;

    @PostMapping
    public ResponseEntity<OrganizationDto> saveOrganization(@RequestBody OrganizationDto organizationDto){
        OrganizationDto organizationDto1 = organizationService.saveOrganization(organizationDto);
        return new ResponseEntity<>(organizationDto1, HttpStatus.CREATED);
    }

    @GetMapping("/{organizationCode}")
    public ResponseEntity<OrganizationDto> getOrganizationByOrganizationCode(@PathVariable String organizationCode){
        OrganizationDto organizationByCode = organizationService.getOrganizationByCode(organizationCode);
        return new  ResponseEntity<>(organizationByCode,HttpStatus.OK);
    }

}
