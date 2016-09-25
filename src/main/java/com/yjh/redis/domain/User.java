package com.yjh.redis.domain;

import java.io.Serializable;

public class User implements Serializable{
	private static final long serialVersionUID = -6011241820070393952L;
	private Long id;
	private String name;
	
	public User() {  
        
    }
	
	public User(Long id, String name) {  
        super();  
        this.id = id;  
        this.name = name;  
    }  
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	
	
}
