package com.example.demo.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.demo.dto.UserInfo;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import com.example.demo.service.CountryInfoService;


@Service
public class UserServiceImpl implements UserService {
	
	@Resource
	private UserMapper userMapper;
	
	
	@Resource
	private CountryInfoService userService2;
	

	@Override
	public String add(UserInfo userInfo) {
//		String id=UUID.randomUUID().toString().replaceAll("-", "");
//		userInfo.setId(id);
		userMapper.isnertUser(userInfo);
		return userInfo.getId();
	}

	@Override
	public UserInfo getUserById(String id) {
		return userMapper.getUserById(id);
	}

}
