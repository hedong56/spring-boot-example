package com.example.demo.mapper;

import org.apache.ibatis.annotations.Insert;

import com.example.demo.dto.UserInfo;

public interface UserMapper {
	
	@Insert("insert into user_info(id,name,birthday,address) values(#{id},#{name},#{birthday},#{address})")
	int isnertUser(UserInfo userInfo);

}
