package com.yjh.redis.web.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.yjh.redis.domain.User;
import com.yjh.redis.service.IUserService;
import com.yjh.redis.utils.AjaxResult;

@Controller
@RequestMapping("/user")
public class UserController {
	private IUserService userService;
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
	
	/**
	 * 导航
	 */
	//访问role界面，展示角色，配置访问路径
	@RequestMapping("/index")	
	public String index(){
		return "/user/user";
	}
	
	/**
	 * 展示列表
	 * @return
	 */
	@RequestMapping("/list")
	@ResponseBody
	public List<User> list(){
		List<User> users = new ArrayList<User>();
		for(int i=1;i<5;i++){
			User user = userService.getUser(i);
			users.add(user);
		}
		return users;
	}
	
	/**
	 * 保存用户到redis
	 */
	@RequestMapping("/save")
	@ResponseBody
	public Map<String,Object> save(Long id,String username){
		Map<String, Object> map = new HashMap<String, Object>();
		//封装数据
		User user = new User();
		user.setId(id);
		user.setName(username);
		// 添加
		userService.saveUser(user);
		map.put("success", "true");
		map.put("msg", "保存成功");
		return map;		
	}
}
