package com.example.demo.dto;

import java.io.Serializable;
import java.util.Date;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class UserInfo implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String id;
	
	//身份证编号
	private String no;
	//员工编号
	private int empNo;
	
	private String name;
	
	private Date birthday;
	
	private String address;
	
	

	public UserInfo() {
		super();
	}
	
	public UserInfo(String no, int empNo) {
		super();
		this.no = no;
		this.empNo = empNo;
	}
	
	public UserInfo(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public UserInfo(String name, Date birthday, String address) {
		super();
		this.name = name;
		this.birthday = birthday;
		this.address = address;
	}
	
	public UserInfo(String id, String name, Date birthday, String address) {
		super();
		this.id = id;
		this.name = name;
		this.birthday = birthday;
		this.address = address;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Date getBirthday() {
		return birthday;
	}


	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * DisableCircularReferenceDetect 表示一直循环完所有的数据，避免出现ref
	 * WriteDateUseDateFormat 将时期格式化为yyyy-MM-dd HH24:mi:ss格式，否则是转成毫秒的数字串
	 * @author hedong
	 * @date 2018年11月22日 下午6:05:22
	 * @modifyNote
	 * @return
	 */
	@Override
	public String toString() {
		return JSON.toJSONString(this,SerializerFeature.DisableCircularReferenceDetect,SerializerFeature.WriteDateUseDateFormat);
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}


}
