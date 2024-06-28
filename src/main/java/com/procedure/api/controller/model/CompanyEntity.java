package com.procedure.api.controller.model;

import com.procedure.api.dto.FullCompanyDto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="company")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CompanyEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long company_id;
	@Column(nullable = false)
	private String company_code;
	@Column(nullable = false)
	private String company_name;
	private String company_description;
	
	public CompanyEntity(String company_code, String company_name, String company_description) {
		this.company_code = company_code;
		this.company_name = company_name;
		this.company_description = company_description;
	}
	
	public static FullCompanyDto toDto(CompanyEntity entity) {
		return new FullCompanyDto(Long.valueOf(entity.getCompany_id()).intValue(), entity.getCompany_code(), entity.getCompany_name(), entity.getCompany_description());
	}
}
