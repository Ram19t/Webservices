package com.webservice.services;

import org.json.JSONObject;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.specification.RequestSpecification;
import com.webservice.requestpojo.*;

public class service {

	public void Login(String loginid, String loginSource, String password){
		LoginPojo loginpojo = new LoginPojo();
		
		Login login = new Login();
		login.setLoginId(loginid);
		login.setLoginSource(loginSource);
		login.setPassword(password);
		
		loginpojo.setLogin(login);
		JSONObject jsonObject = new JSONObject(loginpojo);
		
		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.header("content-type","application/json");
		requestSpecification.body(arg0)
	}
}
