package com.rbqhub.base.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/login")
public class LoginController {

	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	

	public LoginController() {
	}
	
	@RequestMapping("index.do")
	public String index() {
		logger.info("");
		return "success";
	}
	
	@RequestMapping("/")
	public String loginHtml() {
		return "login";
	}
	
	@RequestMapping("/login.do")
	@ResponseBody
	public String doLogin(String loginName,String loginPwd) {
		
		return "login";
	}
}
