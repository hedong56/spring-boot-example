package com.example.demo.exception;


/**
 * 	自定义异常
 * @author hedong
 * @date 2018年12月13日 下午11:27:47
 * @modifyNote
 * @version 1.0
 */
public class ServiceException extends RuntimeException {
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 313544336967391481L;
	
	
	private String code;
	private String msg;
	
	public ServiceException() {
		super();
	}
	
	public ServiceException(String code, String msg) {
		super();
		this.code = code;
		this.msg = msg;
	}
	

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}



	

}
