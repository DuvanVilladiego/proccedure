package com.procedure.api.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.procedure.api.controller.model.CompanyEntity;
import com.procedure.api.controller.model.repository.CompanyRepository;
import com.procedure.api.dto.CompanyDto;
import com.procedure.api.dto.FullCompanyDto;
import com.procedure.api.dto.GeneralResponseDto;
import com.procedure.api.dto.NewCompanyDto;
import com.procedure.api.service.ICompanyService;
import com.procedure.api.utils.Constants;

@Service
public class CompanyServiceImpl implements ICompanyService {

	@Autowired
	private CompanyRepository repository;
	
	@Override
	public GeneralResponseDto<CompanyDto> getById(int id) {
		CompanyDto response =  new CompanyDto();
		try {
			response = null;
	        return new GeneralResponseDto<CompanyDto>(true, Constants.SUCCES_RESPONSE, response);
	    } catch (Exception e) {
	    	return new GeneralResponseDto<CompanyDto>(false,Constants.GET_ERROR_RESPONSE(e), null);        
	    }
	}

	@Override
	public GeneralResponseDto<Object> delete(int id) {
		CompanyDto response =  new CompanyDto();
		try {
			response = null;
	        return new GeneralResponseDto<Object>(true, Constants.SUCCES_RESPONSE, response);
	    } catch (Exception e) {
	    	return new GeneralResponseDto<Object>(false,Constants.GET_ERROR_RESPONSE(e), null);        
	    }
	}

	@Override
	public GeneralResponseDto<FullCompanyDto> update(int id, NewCompanyDto company) {
		FullCompanyDto response =  new FullCompanyDto();
		try {
			response = null;
	        return new GeneralResponseDto<FullCompanyDto>(true, Constants.SUCCES_RESPONSE, response);
	    } catch (Exception e) {
	    	return new GeneralResponseDto<FullCompanyDto>(false,Constants.GET_ERROR_RESPONSE(e), null);        
	    }
	}

	@Override
	public GeneralResponseDto<FullCompanyDto> insert(NewCompanyDto company) {
		FullCompanyDto response =  new FullCompanyDto();
		try {
			CompanyEntity saved = repository.save(NewCompanyDto.toEntity(company));
			response = CompanyEntity.toDto(saved);
	        return new GeneralResponseDto<FullCompanyDto>(true, Constants.SUCCES_RESPONSE, response);
	    } catch (Exception e) {
	    	return new GeneralResponseDto<FullCompanyDto>(false,Constants.GET_ERROR_RESPONSE(e), null);        
	    }
	}

	@Override
	public GeneralResponseDto<List<FullCompanyDto>> getAll() {
		List<FullCompanyDto> response =  new ArrayList<FullCompanyDto>();
		try {
			response = repository.findAll().stream().map(p -> CompanyEntity.toDto(p)).collect(Collectors.toList());
	        return new GeneralResponseDto<List<FullCompanyDto>>(true, Constants.SUCCES_RESPONSE, response);
	    } catch (Exception e) {
	    	return new GeneralResponseDto<List<FullCompanyDto>>(false, Constants.GET_ERROR_RESPONSE(e), null);        
	    }
	}

}
