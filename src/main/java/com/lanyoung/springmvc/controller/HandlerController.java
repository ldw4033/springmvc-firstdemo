package com.lanyoung.springmvc.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HandlerController {
	private static final Logger log=Logger.getLogger(HandlerController.class);
	@RequestMapping("/handler1")
	public String handler1(){
		log.info("handler1");
		return "handler";
	}
	@RequestMapping("/handler2")
	public String handler2(@RequestParam(value="i") int id){
		log.info("handler2");
		log.info(id);
		return "handler";
	}

}
