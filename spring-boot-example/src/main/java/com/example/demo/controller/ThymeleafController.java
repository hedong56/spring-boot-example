package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.UserInfo;

@Controller
@RequestMapping("tmlf")
public class ThymeleafController {
	
	@RequestMapping("index")
	public String index(ModelMap modelMap) {
		modelMap.put("name", "freemarker");
		UserInfo userInfo=new UserInfo("张三", "绵阳");
		modelMap.addAttribute("userInfo", userInfo);
		return "index";
	}

}
