package com.example.demo.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.CountryInfo;
import com.example.demo.service.CountryInfoService;

@RestController
public class CountryInfoController {
	
	private static final Logger logger=LoggerFactory.getLogger(CountryInfoController.class);
	
	@Resource
	private CountryInfoService countryInfoService;
	
	@RequestMapping("cty/get/{ctyCode}")
	public CountryInfo getCountryInfoByCode(@PathVariable(name="ctyCode") String code ) {
		return countryInfoService.queryCountryInfoById(code);
	}
	
	
	@GetMapping("test/log")
	public void getLog() {
		logger.trace("trace level");
		logger.debug("debug level");
		logger.info("info level");
		logger.warn("warn level");
		logger.error("error level");
	}
	
	

}
