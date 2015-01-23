package com.aaron.exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aaron.exam.SpringServicesContextUtil;
import com.aaron.exam.entity.User;
import com.aaron.exam.manager.IUserManager;

@Controller
public class UserController {
	
	@RequestMapping("/")
	public String getUser(){
		IUserManager userManage=SpringServicesContextUtil.getBean("userManage");
		// 返回查询的数量
		System.out.println("old:"+userManage.lookUser());
		// 保存一个新的对象
		userManage.saveUser(new User());
		System.out.println("new:"+userManage.lookUser());
		return "index";
	}
}
