package com.example.demo.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.demo.dto.CountryInfo;
import com.example.demo.mapper.CountryInfoMapper;
import com.example.demo.service.CountryInfoService;

@Service
public class CountryInfoServiceImpl implements CountryInfoService {
	
	@Resource
	private CountryInfoMapper countryInfoMapper;

	@Override
	public CountryInfo queryCountryInfoById(String code) {
		return countryInfoMapper.getCountryInfoByCode(code);
	}

}
