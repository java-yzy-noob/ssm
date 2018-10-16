package com.javasm.user.service;

import com.javasm.user.entity.User;

public interface IUserService {

	User userLogin(String uname, String upwd);

	Integer addUser(String uname, String upwd);

}
