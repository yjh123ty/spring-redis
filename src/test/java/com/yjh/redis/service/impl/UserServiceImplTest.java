package com.yjh.redis.service.impl;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.yjh.redis.BaseTest;
import com.yjh.redis.domain.User;
import com.yjh.redis.service.IUserService;

public class UserServiceImplTest extends BaseTest{
	@Autowired
	private IUserService userService;
	@Test
	public void testUserService() {
		User user = new User();
		user.setId(4l);
		user.setName("songsong");
		userService.saveUser(user);
		System.out.println(userService.getUser(4L).getName());
	}
	

}
