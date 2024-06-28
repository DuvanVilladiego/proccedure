package com.procedure.api.utils;

public class Constants {
	//GLOBAL SERVICE PATHS
	public static final String COMPANY_SERVICE_PATH = "api/company";

	//COMPANY SERVICE PATHS
	public static final String COMPANY_SERVICE_GET_ALL_PATH = "/";
	public static final String COMPANY_SERVICE_INSERT_PATH = "/";
	public static final String COMPANY_SERVICE_GET_BY_ID_PATH = "/{id}";
	public static final String COMPANY_SERVICE_DELETE_BY_ID_PATH = "/{id}";
	public static final String COMPANY_SERVICE_UPDATE_BY_ID_PATH = "/{id}";
	
	//FEEDBACK RESPONSE MESSAGES
	public static final String SUCCES_RESPONSE = "SUCCESS";
	public static final String GET_ERROR_RESPONSE(Exception e) {return String.format("ERROR, %s", e.getMessage());};
}
