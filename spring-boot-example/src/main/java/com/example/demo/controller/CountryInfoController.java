package com.example.demo.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.CountryInfo;
import com.example.demo.service.CountryInfoService;

@RestController
public class CountryInfoController {
	
	@Resource
	private CountryInfoService countryInfoService;
	
	@RequestMapping("cty/get/{ctyCode}")
	public CountryInfo getCountryInfoByCode(@PathVariable(name="ctyCode") String code ) {
		return countryInfoService.queryCountryInfoById(code);
	}
	
	

}
