package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HenkouController {
	@RequestMapping(path = "/henkou1", method = RequestMethod.POST)
	public String henkou1(Model model, String name, String price) {
		model.addAttribute("name", name);
		model.addAttribute("price", price);
		return "henkou1";
	}

	@RequestMapping(path = "/henkou2", method = RequestMethod.POST)
	public String henkou2(Model model, String name, String price) {
		System.out.println("変更後の名前は" + name);
		System.out.println("変更後の値段は" + price);
		return "henkou2";
	}
}
