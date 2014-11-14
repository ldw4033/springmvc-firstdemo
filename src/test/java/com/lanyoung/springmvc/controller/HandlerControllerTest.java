/*   
 * Copyright (c) 2013-2023 LanYoung tech co., LTD. All Rights Reserved.   
 *   
 * This software is the confidential and proprietary information of   
 * LanYoung tech. You shall not disclose such Confidential Information   
 * and shall use it only in accordance with the terms of the agreements   
 * you entered into with LanYoung tech.   
 *   
 */
package com.lanyoung.springmvc.controller;

import java.io.IOException;

import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.util.FileCopyUtils;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

public class HandlerControllerTest {

	@Test
	public void testHandler7() throws IOException {
		RestTemplate rt = new RestTemplate();
		byte[] resp = rt.postForObject("http://localhost:8088//handler7/{imageId}", null, byte[].class, "12345");
		Resource res = new FileSystemResource("D:\\Users\\Desktop\\logo.png");
		FileCopyUtils.copy(resp, res.getFile());
	}

	@Test
	public void testHandler8() {
		RestTemplate rt = new RestTemplate();
		MultiValueMap<String, String> form = new LinkedMultiValueMap<String, String>();
		form.add("username", "tom");
		form.add("password", "123456");
		form.add("age", "45");
		rt.postForLocation("http://localhost:8088//handler8", form);
	}

}
