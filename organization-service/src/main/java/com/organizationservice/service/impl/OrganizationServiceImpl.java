package com.organizationservice.service.impl;

import com.organizationservice.entity.Organization;
import com.organizationservice.mapper.OrganizationMapper;
import com.organizationservice.payload.OrganizationDto;
import com.organizationservice.repository.OrganizationRepository;
import com.organizationservice.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrganizationServiceImpl implements OrganizationService {

    @Autowired
    private OrganizationRepository organizationRepository;

    @Override
    public OrganizationDto saveOrganization(OrganizationDto organizationDto) {
        Organization organization = OrganizationMapper.organizationDtoToOrganization(organizationDto);
        Organization savedOrganization = organizationRepository.save(organization);
        OrganizationDto savedOrganizationDto = OrganizationMapper.organizationToOrganizationDto(savedOrganization);
//        savedOrganizationDto.setId(savedOrganization.getId());
//        savedOrganizationDto.setCreatedTime(savedOrganization.getCreatedTime());
        return savedOrganizationDto;
    }

    @Override
    public OrganizationDto getOrganizationByCode(String organizationCode) {
        Organization organizationByCode = organizationRepository.getOrganizationByOrganizationCode(organizationCode);
        return OrganizationMapper.organizationToOrganizationDto(organizationByCode);
    }
}
