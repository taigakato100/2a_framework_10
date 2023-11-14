package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HenkouController {
	@RequestMapping(path = "/henkou1", method = RequestMethod.GET)
	public String henkou1() {
		return "henkou1";
	}

	@RequestMapping(path = "/henkou1", method = RequestMethod.POST)
	public String henkou1Post(Model model, String name, String price, String img) {
		model.addAttribute("name", name);
		model.addAttribute("price", price);
		model.addAttribute("img", img);
		return "henkou2";
	}

}
