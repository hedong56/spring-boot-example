package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UserInfo;



@RestController
public class ExceptionController {
	
	
	
	
	@GetMapping("exp/u/{id}")
	public UserInfo getUserInfoById(@PathVariable(name="id") String userId ) {
		System.out.println(String.format("输入的参数：%s", userId));
		int i=1/0;
		return new UserInfo("张三", "成都");
	}

}
