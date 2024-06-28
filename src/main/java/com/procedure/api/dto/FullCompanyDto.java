package com.procedure.api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FullCompanyDto {
	private int id;
	private String company_code;
	private String company_name;
	private String company_description;
}
