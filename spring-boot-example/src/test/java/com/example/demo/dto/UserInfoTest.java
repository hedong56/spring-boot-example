package com.example.demo.dto;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.UUID;

import org.junit.Test;

public class UserInfoTest {

	@Test
	public void testToString() {
		
		UserInfo u=new UserInfo(UUID.randomUUID().toString().replaceAll("-", ""), "张三", new Date(), "四川绵阳");
		System.out.println(u.toString());
		
		
	}

}
