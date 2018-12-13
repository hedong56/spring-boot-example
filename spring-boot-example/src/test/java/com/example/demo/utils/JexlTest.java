package com.example.demo.utils;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.collections4.MapUtils;
import org.apache.commons.jexl3.JexlContext;
import org.apache.commons.jexl3.JexlEngine;
import org.apache.commons.jexl3.JexlExpression;
import org.apache.commons.jexl3.MapContext;
import org.apache.commons.jexl3.internal.Engine;
import org.junit.Test;

public class JexlTest {
	
	private static JexlEngine jexlEngine = new Engine();
	public static Object executeExpression(String jexlExpression, Map<String, Object> map) {
	    JexlExpression expression = jexlEngine.createExpression(jexlExpression);
	    JexlContext context = new MapContext();
	    if (MapUtils.isNotEmpty(map)) {
	        map.forEach(context::set);
	    }
	    return expression.evaluate(context);
	}

	/**
	    *     支持调用String的函数
	 * @Description
	 * @author hedong
	 * @date 2018年12月11日 下午10:56:49
	 * @modifyNote
	 */
	@Test
	public void testStringFun() {
		
		Map<String, Object> map = new HashMap<>();
	    map.put("num", "0123456789");
	    String expression = "num.substring(2,6)";
	    //2345
	    System.out.println(executeExpression(expression, map));
	}
	
	/**
	    *    支持三目判断表达式中，字符串空判断
	 * @Description
	 * @author hedong
	 * @date 2018年12月11日 下午11:01:27
	 * @modifyNote
	 */
	@Test
	public void testStringEmpty() {
		
		Map<String, Object> map = new HashMap<>();
	    map.put("name", "");
	    String expression = "(name==null||name==\"\")?\"无名\":name";
	    //无名
	    System.out.println(executeExpression(expression, map));
	}
	
	@Test
	public void testArray() {
		
		Map<String, Object> map = new HashMap<>();
	    map.put("names", new String[] {"张三","李四","王五","赵六"});
	    String expression = "names[2]";
	    //王五
	    System.out.println(executeExpression(expression, map));
	    expression = "names.size()";
	    //4
	    System.out.println(executeExpression(expression, map));
	}
	

}
