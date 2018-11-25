package com.example.demo.controller;

import java.util.Date;
import java.util.UUID;

import javax.annotation.Resource;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UserInfo;
import com.example.demo.service.UserService;




@RestController
public class UserController {
	
	@Resource
	private UserService userService;
	
	/**
	 * 返回基本数据类型
	 * @Description
	 * @author hedong
	 * @date 2018年11月22日 下午5:25:16
	 * @modifyNote 
	 * @return
	 */
	@RequestMapping("hello")
	public String showHello() {
		return "hello world!";
	}
	
	
	@RequestMapping("getUserInfo")
	public UserInfo getUserInfo(String id) {
		return new UserInfo(UUID.randomUUID().toString().replaceAll("-", ""), "张三", new Date(), "四川绵阳");
	}
	
	
	
	@RequestMapping("add")
	public String addUserInfo() {
		UserInfo userinfo= new UserInfo( "李四", new Date(), "四川绵阳");
		return userService.add(userinfo);
	}
	
	
	
	

}
