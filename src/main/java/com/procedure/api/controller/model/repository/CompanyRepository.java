package com.procedure.api.controller.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.procedure.api.controller.model.CompanyEntity;

public interface CompanyRepository extends JpaRepository<CompanyEntity, Long> {

}
