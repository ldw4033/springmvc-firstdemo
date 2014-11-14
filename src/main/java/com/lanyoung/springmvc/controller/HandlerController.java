package com.lanyoung.springmvc.controller;

import java.awt.image.RescaleOp;
import java.io.IOException;
import java.io.OutputStream;



import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpOutputMessage;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.util.WebUtils;

import com.lanyoung.springmvc.domain.User;

/**
 * 
 * @ClassName: HandlerController
 * @Description: TODO(这里用一句话描述这个类的作用)
 *
 * @author liudw
 * @date 2014年11月5日 下午3:01:13
 * @version
 * @see
 * @sine
 */
@Controller
public class HandlerController {
	private static final Logger log = Logger.getLogger(HandlerController.class);

	@RequestMapping("/handler1")
	public String handler1() {
		log.info("handler1");
		return "handler";
	}

	@RequestMapping("/handler2")
	public String handler2(@RequestParam(value = "user") String userName, @RequestParam(value = "pwd") String password, @RequestParam(required = false) String realName) {
		log.info("handler2");
		log.info(userName);
		log.info(password);
		log.info(realName);

		return "handler";
	}

	@RequestMapping("/handler3")
	public String handler3(@RequestHeader(value = "Accept-Encoding") String encoding,
	// @RequestParam(value="Keep-Alive")Long keepAlive,
			@RequestParam(value = "Accept-Language") String host) {
		log.info("handler3");
		log.info(encoding);
		// log.info(keepAlive);
		log.info(host);

		return "handler";
	}

	@RequestMapping("/handler4")
	public String handler4(User user) {
		log.info("handler4");
		log.info(user);
		// log.info(keepAlive);
		// log.info(host);
		return "handler";
	}

	@RequestMapping("/handler5")
	public String handler5(HttpServletRequest request) {
		log.info("handler5");
		String username = WebUtils.findParameterValue(request, "username");

		log.info(username);
		log.info(request.getParameterMap());
		// log.info(host);
		return "handler";
	}

	@RequestMapping("/handler6")
	public void handler6(OutputStream os) throws IOException {
		log.info("handler6");
		Resource res = new ClassPathResource("/logo.png");
		FileCopyUtils.copy(res.getInputStream(), os);
	}
	
	
	@ResponseBody
	@RequestMapping("/handler7/{imageId}")
	public byte[] handler7(@PathVariable("imageId") String imageId) throws IOException {
		log.info("handler7");
		log.info(imageId);
		Resource res = new ClassPathResource("/logo.png");
		//FileCopyUtils.copy(res.getInputStream(), os);
		byte[] bs= FileCopyUtils.copyToByteArray(res.getInputStream());
		log.info(bs);
		return bs;
	}

	@RequestMapping("/handler8")
	public String handler8(@RequestBody() String req) throws IOException {
		log.info("handler8");
		
		log.info(req);
		return "handler";
	}
}
