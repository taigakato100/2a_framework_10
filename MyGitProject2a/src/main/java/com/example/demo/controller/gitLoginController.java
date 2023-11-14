package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.servlet.http.HttpSession;

@Controller
public class gitLoginController {

	//一覧表示用
	@RequestMapping(path = "/gitpralogin", method = RequestMethod.GET)
	public String viewPage() {

		return "gitpralogin";
	}

	//ログイン検証用
	@RequestMapping(path = "/gitpralogin", method = RequestMethod.POST)
	public String loginPost(String username, String password, HttpSession session) {

		if (username.equals("gitlogin") && password.equals("gitpw")) {
			return "gititemlist";
		} else {
			return "gitlogin";
		}
	}
}