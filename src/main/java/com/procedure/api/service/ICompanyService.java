package com.procedure.api.service;

import java.util.List;

import com.procedure.api.dto.CompanyDto;
import com.procedure.api.dto.FullCompanyDto;
import com.procedure.api.dto.GeneralResponseDto;
import com.procedure.api.dto.NewCompanyDto;

public interface ICompanyService {

	public GeneralResponseDto<CompanyDto> getById(int id);
	public GeneralResponseDto<Object> delete(int id);
	public GeneralResponseDto<CompanyDto> update(int id, NewCompanyDto company);
	public GeneralResponseDto<CompanyDto> insert(NewCompanyDto company);
	public GeneralResponseDto<List<FullCompanyDto>> getAll();
	
}
