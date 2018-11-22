package com.example.demo.dto;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class UserInfoTest {

	@Test
	public void testToString() {
		
		UserInfo u=new UserInfo(1L, "张三", new Date(), "成都");
		System.out.println(u.toString());
		
	}

}
