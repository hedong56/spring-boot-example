package com.example.demo.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;

import com.example.demo.dto.UserInfo;

public interface UserMapper {
	
	//@Options 将自动生成的主键列和属性字段映射
	@Insert("insert into user_info(name,birthday,address) values(#{name},#{birthday},#{address})")
	@Options(useGeneratedKeys=true,keyProperty="id",keyColumn="id")
	int isnertUser(UserInfo userInfo);

}
