package com.example.chargebackcalcdemo.controllers;


import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.chargebackcalcdemo.dao.AdminDao;
import com.example.chargebackcalcdemo.models.Admin;
import com.example.chargebackcalcdemo.models.AdminLogin;


@Controller
public class AdminController {
	@Autowired
	private AdminDao dao;
	
	@GetMapping(value="/admin")
	 public String admin(Model model) {
		 model.addAttribute("admin",new Admin());
		 return "AdminRegistration";
	 }
	
	
	@PostMapping(value="/adminreg")
	public String adminreg(@ModelAttribute("admin") Admin adminreg,Model model) {
		Admin ar= dao.save(adminreg);
		if(ar!=null) {
			model.addAttribute("message","Your details are submitted successfully.");
			return "AdminRegistration";
		}else {
			model.addAttribute("message","Oops...Something went wrong.");
			return "failure";
		}
		
	}
	@GetMapping(value="/adminlogin")
	public String adminlogin(Model model) {
		model.addAttribute("adminlogin", new AdminLogin());
		return "AdminLogin";
	}
	
	@PostMapping(value="/loginverify")
	public String loginverify(@ModelAttribute("adminlogin") AdminLogin adminlogin,Model model,HttpSession session) {
		Optional<Admin> al=dao.findById(adminlogin.getAdminId());
		if(al!=null) {
			Admin a1=al.get();
			if(a1.getPassword().equals(adminlogin.getPassword())) {
				session.setAttribute("name", a1.getFirstName());
				return "adminhome";
			}		
		}
		model.addAttribute("message", "Invalid userId or password");
		return "AdminLogin";
		
	}
	@GetMapping(value="/adminlogout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}

	
	
	

}
