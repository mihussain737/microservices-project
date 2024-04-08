package com.organizationservice.service;

import com.organizationservice.payload.OrganizationDto;

public interface OrganizationService {

    public OrganizationDto saveOrganization(OrganizationDto organizationDto);
    public OrganizationDto getOrganizationByCode(String organizationCode);
}
