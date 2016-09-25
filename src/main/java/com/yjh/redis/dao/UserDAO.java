package com.yjh.redis.dao;

import org.springframework.stereotype.Component;

import com.yjh.redis.domain.User;

public interface UserDAO {
	void saveUser(User user);
	User getUser(long id);
	
}
