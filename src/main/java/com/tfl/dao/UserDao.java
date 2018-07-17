package com.tfl.dao;

public interface UserDao {
	
	// 查询所有用户
	public String queryUser();
	
	// 查询用户的密码
	public String queryPassword(String name);
}
