package com.organizationservice.mapper;

import com.organizationservice.entity.Organization;
import com.organizationservice.payload.OrganizationDto;

public class OrganizationMapper {

    public static Organization organizationDtoToOrganization(OrganizationDto organizationDto) {
        Organization organization = new Organization();
        organization.setId(organizationDto.getId());
        organization.setOrganizationName(organizationDto.getOrganizationName());
        organization.setOrganizationDescription(organizationDto.getOrganizationDescription());
        organization.setOrganizationCode(organizationDto.getOrganizationCode());
        organization.setCreatedTime(organizationDto.getCreatedTime());
        return organization;
    }

    public static OrganizationDto organizationToOrganizationDto(Organization organization) {

        OrganizationDto organizationDto = new OrganizationDto();
        organizationDto.setId(organization.getId());
        organizationDto.setOrganizationName(organization.getOrganizationName());
        organizationDto.setOrganizationDescription(organization.getOrganizationDescription());
        organizationDto.setOrganizationCode(organization.getOrganizationCode());
        organizationDto.setCreatedTime(organization.getCreatedTime());
        return organizationDto;
    }
}
