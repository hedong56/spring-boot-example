package com.example.demo.domain;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomExceptionHandler {
	
	public static final Logger logger=LoggerFactory.getLogger(CustomExceptionHandler.class);
	
	@ExceptionHandler(Exception.class)
	Object handException(Exception ex,HttpServletRequest request) {
		
		logger.error("请求url:{}, 异常消息信息： {} ", request.getRequestURI(),ex.getMessage());
		logger.error("详细异常信息：", ex);
		
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("code", 100);
		map.put("msg", "发生异常");
		map.put("url",request.getRequestURI());
		return map;
	}

}
