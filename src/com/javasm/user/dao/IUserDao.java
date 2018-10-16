package com.javasm.user.dao;

import org.apache.ibatis.annotations.Param;

import com.javasm.user.entity.User;

public interface IUserDao {

	User userLogin(@Param("ua")String uname, @Param("up")String upwd);

	int addUser(@Param("ua")String uname, @Param("up")String upwd);
	
}
