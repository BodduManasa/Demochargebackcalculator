package com.example.chargebackcalcdemo.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.chargebackcalcdemo.models.Employee;
import com.example.chargebackcalcdemo.models.EmployeeLogin;
import com.example.chargebackcalcdemo.services.EmployeeServices;

@Controller
@RequestMapping("/")

public class EmployeeController {
	@Autowired
	public EmployeeServices services;
	
@GetMapping("/employeelogin")
public String employeeLogin(Model model)
{
	EmployeeLogin employeelogin=new EmployeeLogin();
	
	model.addAttribute("employeelog", employeelogin);
	
	return "EmployeeLogin";
	
}

@GetMapping("/employeeregister")

public String employeeRegister(Model model)
{
	Employee employee=new Employee();
	model.addAttribute("employeereg", employee);
	return "Employeeregistration";
}
@PostMapping("/empreg")
public String verifyEmpRegistration(@Valid @ModelAttribute("employeereg") Employee employee, Model model, BindingResult result, HttpSession  session)
{
	if(result.hasErrors())
	{
		return "Employeeregistration";
	}else
	{
				int res=services.Register(employee);
		if(res==1)
		{
			model.addAttribute("message","you already registerd.please login <a href='/EmployeeLogin'>Login</a>");
			return "employeehome";
		}
		else if(res==2)
		{
			model.addAttribute("message","successfully registerd.please login <a href='/EmployeeLogin'>Login</a>");
			return "employeehome";
		
	}
	return "failure";
}
}

@PostMapping("/emplogin")
public String verifyEmpLogin(@Valid @ModelAttribute("employeelog") EmployeeLogin employee, Model model, BindingResult result,HttpSession session)
{
	
	if(result.hasErrors())
	{
		return "EmployeeLogin";
	}
	else {
	
	if(services.Login(employee))
	{
		
		model.addAttribute("message", employee.getEmpid()+"successfully logged in");
		return "success";
	}
	model.addAttribute("message", "Invalid Userid or Password");
	//System.out.println(admin);
	return "failure";
	}

	
}

}







