package com.example.demo.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.demo.dto.UserInfo;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;


@Service
public class UserServiceImpl implements UserService {
	
	@Resource
	private UserMapper userMapper;

	@Override
	public String add(UserInfo userInfo) {
		userMapper.isnertUser(userInfo);
		return userInfo.getId();
	}

}
