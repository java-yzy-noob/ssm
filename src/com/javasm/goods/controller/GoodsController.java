package com.javasm.goods.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.javasm.goods.dao.GoodMapper;
import com.javasm.goods.entity.Good;

@Controller
@RequestMapping("/gc")
public class GoodsController {
	
	@Resource
	private GoodMapper gm;
	
	@RequestMapping("/getAllGoods")
	public ModelAndView getAllGoods(@RequestParam(value="pagenum",defaultValue="1")int pagenum) {
		//1.开启分页
		PageHelper.startPage(pagenum,3);
		List<Good> list = gm.selectAll();
		
		
		//2.把结果集封装到PageInfo对象中。
		//PageInfo对象，包含数据集，包含分页信息
		PageInfo<Good> page = new PageInfo<>(list);
		System.out.println(page);
		ModelAndView mav = new ModelAndView();
		mav.addObject("PageInfo", page);
		mav.setViewName("goodList");
		return mav;
		
		
	}

		
	
}
