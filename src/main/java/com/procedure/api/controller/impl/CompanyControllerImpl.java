package com.procedure.api.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.procedure.api.controller.ICompanyController;
import com.procedure.api.dto.CompanyDto;
import com.procedure.api.dto.FullCompanyDto;
import com.procedure.api.dto.GeneralResponseDto;
import com.procedure.api.dto.NewCompanyDto;
import com.procedure.api.service.ICompanyService;
import com.procedure.api.utils.Constants;

@RestController
@RequestMapping(Constants.COMPANY_SERVICE_PATH)
public class CompanyControllerImpl implements ICompanyController {

	@Autowired
	private ICompanyService service;
	
	@Override
	@GetMapping(Constants.COMPANY_SERVICE_GET_ALL_PATH)
	public ResponseEntity<GeneralResponseDto<CompanyDto>> getCompany(@PathVariable int id) {
		GeneralResponseDto<CompanyDto> response = service.getById(id);
		if (response.getStatus()) {
			return ResponseEntity.ok(response);
		} else {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
		}
	}

	@Override
	@DeleteMapping(Constants.COMPANY_SERVICE_DELETE_BY_ID_PATH)
	public ResponseEntity<GeneralResponseDto<Object>> deleteCompany(@PathVariable int id) {
		GeneralResponseDto<Object> response = service.delete(id);
		if (response.getStatus()) {
			return ResponseEntity.ok(response);
		} else {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
		}
	}

	@Override
	@PutMapping(Constants.COMPANY_SERVICE_UPDATE_BY_ID_PATH)
	public ResponseEntity<GeneralResponseDto<CompanyDto>> updateCompany(@PathVariable int id, @RequestBody NewCompanyDto company) {
		GeneralResponseDto<CompanyDto> response = service.update(id, company);
		if (response.getStatus()) {
			return ResponseEntity.ok(response);
		} else {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
		}
	}

	@Override
	@PutMapping(Constants.COMPANY_SERVICE_INSERT_PATH)
	public ResponseEntity<GeneralResponseDto<CompanyDto>> insertCompany(@RequestBody NewCompanyDto company) {
		GeneralResponseDto<CompanyDto> response = service.insert(company);
		if (response.getStatus()) {
			return ResponseEntity.ok(response);
		} else {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
		}
	}

	@Override
	@GetMapping(Constants.COMPANY_SERVICE_GET_ALL_PATH)
	public ResponseEntity<GeneralResponseDto<List<FullCompanyDto>>> getAllCompanies() {
		GeneralResponseDto<List<FullCompanyDto>> response = service.getAll();
		if (response.getStatus()) {
			return ResponseEntity.ok(response);
		} else {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
		}
	}

}
