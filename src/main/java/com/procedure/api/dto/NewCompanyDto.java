package com.procedure.api.dto;

import com.procedure.api.controller.model.CompanyEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NewCompanyDto {
	private String company_code;
	private String company_name;
	private String company_description;
	
	public static CompanyEntity toEntity(NewCompanyDto entity) {
		return new CompanyEntity(entity.getCompany_code(), entity.getCompany_name(), entity.getCompany_description());
	}
}
