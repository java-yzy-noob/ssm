package com.javasm.util;

import javax.annotation.Resource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.javasm.util.redis.service.RedisService;

@Controller
@RequestMapping("/rc")
public class RedisController {
	//log4j2下获取Logger日志记录对象
	private Logger logger = LogManager.getLogger(RedisController.class);
	@Resource
	RedisService rs;
	
	@RequestMapping("/test")
	public ModelAndView Test() {
		
		logger.debug("debug信息");
		
		rs.set("test", "test6666666666");
		String string = rs.get("test");
		
		;
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("redis");
		mav.addObject("test", string);
		mav.addObject("hkeys", rs.hkeys("*"));
		
		return mav;
		
	}
	

}
