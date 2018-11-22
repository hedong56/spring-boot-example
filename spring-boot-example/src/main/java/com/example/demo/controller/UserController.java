package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




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
	
	

}
