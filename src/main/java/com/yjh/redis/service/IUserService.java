package com.yjh.redis.service;

import com.yjh.redis.domain.User;

public interface IUserService {
	public void saveUser(User user);
	public User getUser(long id);
	
}
