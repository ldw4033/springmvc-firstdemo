package com.lanyoung.springmvc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lanyoung.springmvc.domain.User;

@Controller
public class LoginController {
	private static final Logger log = LoggerFactory.getLogger(LoginController.class); 
	@RequestMapping("/loginUI")
	public String loginUI(){
		log.info("LoginUI");
		return "loginUI";
	}

	@RequestMapping(value="/login",method=RequestMethod.POST)
	public @ResponseBody User login(@ModelAttribute(value="user") User user){
		log.info(user.toString());
		return user;
	}

}
