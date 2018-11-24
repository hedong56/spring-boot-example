package com.example.demo.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UserInfo;




@RestController
public class UserController {
	
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
	public UserInfo getUserInfo(Long id) {
		
		if(id==1l) {
			return new UserInfo(1L, "张三", new Date(), "四川绵阳");
		}
		
		return null;
		
	}
	
	

}
