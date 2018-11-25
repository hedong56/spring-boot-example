package com.example.demo.mapper;

import org.apache.ibatis.annotations.Insert;

import com.example.demo.dto.UserInfo;

public interface UserMapper {
	
	@Insert("insert into user_info(name,birthday,address) values(#{name},#{birthday},#{address})")
	int isnertUser(UserInfo userInfo);

}
