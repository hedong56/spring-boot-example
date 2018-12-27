package com.example.demo.exception;


/**
 * 登陆超时异常
 * 继承RuntimeException，不用在方法头上，显式抛出
 * 继承Exception，需要在方法头上，显式抛出
 * @author hedong
 * @date 2018年12月16日 上午11:19:19
 * @modifyNote
 * @version 1.0
 */
public class TimeoutException extends RuntimeException {

	public TimeoutException() {
		super();
	}
}
