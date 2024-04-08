package com.organizationservice.repository;

import com.organizationservice.entity.Organization;
import com.organizationservice.payload.OrganizationDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizationRepository extends JpaRepository<Organization,Long> {
    Organization getOrganizationByOrganizationCode(String organizationCode);
}
