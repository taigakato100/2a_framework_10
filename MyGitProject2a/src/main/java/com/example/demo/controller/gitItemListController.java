package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class gitItemListController {

	//画面表示
	@RequestMapping(path = "/gititemlist", method = RequestMethod.GET)
	public String doListGet() {

		//htmlを表示
		return "gititemlist";
	}

}
