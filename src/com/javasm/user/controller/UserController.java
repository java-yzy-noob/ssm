package com.javasm.user.controller;



import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javasm.user.entity.User;
import com.javasm.user.service.IUserService;

@Controller
@RequestMapping("/uc")
public class UserController {
	@Resource
	private IUserService us;
	private Logger logger = LogManager.getLogger(UserController.class);
	
	@RequestMapping("/login")
	public String userLogin(String uname, String upwd, HttpServletRequest req) {
		logger.debug("debug信息");
		logger.info("info信息");
		logger.warn("warn信息");
		logger.error("warn信息");
		User user = us.userLogin(uname, upwd);
		if (user != null) {
			req.setAttribute("uname", user.getUname());
			req.setAttribute("uid", user.getUid());
		}
		return "suc";
	}
	@RequestMapping("/addUser")
	public String userLogin(String uname, String upwd) {
		int a = us.addUser(uname, upwd);
		System.out.println(a);
		return "suc";
	}
}
