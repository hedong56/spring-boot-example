package com.example.demo.mapper;

import com.example.demo.dto.CountryInfo;

public interface CountryInfoMapper {
	
	/**
	 * 根据编号查询国家
	 * @Description
	 * @author hedong
	 * @date 2018年12月9日 下午4:45:38
	 * @modifyNote 
	 * @param code
	 * @return
	 */
	public CountryInfo getCountryInfoByCode(String code);


}
