package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.UserInfo;

@Controller
@RequestMapping("fmk")
public class FreemarkerController {
	
	@RequestMapping("index")
	public String getFreemarkerPage(ModelMap modlMap ) {
		modlMap.put("name", "freemarker");
		UserInfo userInfo=new UserInfo("张三", "绵阳");
		modlMap.addAttribute("userInfo", userInfo);
		return "fmk/index"; //会根据配置文件的路径去找index.ftl文件
	}

}
