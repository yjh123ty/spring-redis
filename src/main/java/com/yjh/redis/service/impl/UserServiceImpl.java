package com.yjh.redis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yjh.redis.dao.UserDAO;
import com.yjh.redis.domain.User;
import com.yjh.redis.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{
	@Autowired
	private UserDAO userDAO;
	
	public void saveUser(User user) {
		userDAO.saveUser(user);
	}
	
	public User getUser(long id) {
		return userDAO.getUser(id);
	}

}
