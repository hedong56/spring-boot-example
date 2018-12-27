package com.example.demo.domain;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.exception.ServiceException;
import com.example.demo.exception.TimeoutException;

@RestControllerAdvice
public class CustomExceptionHandler {
	
	public static final Logger logger=LoggerFactory.getLogger(CustomExceptionHandler.class);
	
	/**
	 * Exception 需要处理的异常
	 * @Description
	 * @author hedong
	 * @date 2018年12月13日 下午11:00:55
	 * @modifyNote 
	 * @param ex
	 * @param request
	 * @return
	 */
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
	
	@ExceptionHandler(ServiceException.class)
	Object handleMyException(ServiceException ex) {
		
		//跳转到制定页面
//		ModelAndView mv=new ModelAndView();
//		mv.setViewName("error.html");
//		mv.addObject("msg", ex.getMessage());
//		return mv;
		
		//返回消息
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("code", ex.getCode());
		map.put("msg", ex.getMsg());
		return map;
		
	}
	
	@ExceptionHandler(TimeoutException.class)
	Object handleTimeoutException(Exception ex) {
		
//		跳转到制定页面
		ModelAndView mv=new ModelAndView();
		mv.setViewName("loggin.html");
		return mv;
		
	}

}
