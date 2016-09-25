package com.yjh.redis;


import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.connection.jedis.JedisConnection;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yjh.redis.dao.UserDAO;
import com.yjh.redis.dao.impl.UserDAOImpl;
import com.yjh.redis.domain.User;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class BaseTest{
	
	 @Test
	public void testJedis() throws Exception {
		 ApplicationContext ac =  new ClassPathXmlApplicationContext("classpath:/applicationContext.xml");
		 
//		 System.out.println(ac.getBeansWithAnnotation(Repository.class));
//		 UserDAO userDAO = ac.getBean(UserDAO.class);
		 UserDAO userDAO = (UserDAO) ac.getBean("userDAO");
		 System.out.println(userDAO);
	        User user1 = new User();
	        user1.setId(3L);
	        user1.setName("abby");
	        userDAO.saveUser(user1);
	        
	        User user2 = userDAO.getUser(1);
	        System.out.println(user2.getName());
		 
		 
//		 JedisConnectionFactory factory = (JedisConnectionFactory) ac.getBean("connectionFactory");
//		 JedisConnection connection = factory.getConnection();
//		 Jedis nativeConnection = connection.getNativeConnection();
//		 System.out.println(nativeConnection.get("age"));
		//关闭连接
//		connection.close();
		 
	    }
}
