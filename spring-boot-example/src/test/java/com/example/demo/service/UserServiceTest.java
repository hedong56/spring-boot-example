package com.example.demo.service;

import static org.junit.Assert.assertNotNull;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.fastjson.JSON;
import com.example.demo.dto.UserInfo;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {
	
	@Before
    public void setUp() throws Exception {
        // 初始化测试用例类中由Mockito的注解标注的所有模拟对象
//        MockitoAnnotations.initMocks(this);
    }
	
	
	@Resource
	private UserService userService;
	
	
//	@MockBean
//	private UserMapper userMapper;
//
//	@Test
//	public void testGetUserById() {
//		
//
//		when(userMapper.getUserById(Mockito.anyString())).thenReturn(new UserInfo("UserMapper", "UserMapper"));
//		
//		
//		UserInfo ui=userService.getUserById("");
//		
//		System.out.println(JSON.toJSONString(ui));
//		
//		assertNotNull(ui);
//		
//	}
	
	
	@Test
	public void testGetUserById2() {
		
		UserInfo ui=userService.getUserById("78708565-3038-4c36-9f38-cc3bf8ad101a");
		
		System.out.println(JSON.toJSONString(ui));
		
		assertNotNull(ui);
		
	}

}
