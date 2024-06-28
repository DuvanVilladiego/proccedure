package com.procedure.api.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.procedure.api.dto.CompanyDto;
import com.procedure.api.dto.FullCompanyDto;
import com.procedure.api.dto.GeneralResponseDto;
import com.procedure.api.dto.NewCompanyDto;

public interface ICompanyController {

	public ResponseEntity<GeneralResponseDto<CompanyDto>> getCompany(int id);
	public ResponseEntity<GeneralResponseDto<Object>> deleteCompany(int id);
	public ResponseEntity<GeneralResponseDto<FullCompanyDto>> updateCompany(int id, NewCompanyDto company);
	public ResponseEntity<GeneralResponseDto<FullCompanyDto>> insertCompany(NewCompanyDto company);
	public ResponseEntity<GeneralResponseDto<List<FullCompanyDto>>> getAllCompanies();
	
}
