package com.example.chargebackcalcdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	//@RequestMapping(value="/",method = RequestMethod.GET)
	@GetMapping(value = "/")
	public String home()
	{
		return "home";
	}

}
