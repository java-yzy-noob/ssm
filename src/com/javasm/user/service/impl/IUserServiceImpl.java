package com.javasm.user.service.impl;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javasm.user.dao.IUserDao;
import com.javasm.user.entity.User;
import com.javasm.user.service.IUserService;

@Service
public class IUserServiceImpl implements IUserService{
	
	@Resource
	private IUserDao userDao;

	@Override
	@Transactional
	public User userLogin(String uname, String upwd) {
		System.out.println("service里的:"+uname+"---------"+upwd);
		return userDao.userLogin(uname, upwd);
	}
	
	
	public Integer addUser(String uname, String upwd) {
		return userDao.addUser(uname, upwd);
	}
	
}
