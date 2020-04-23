package com.example.chargebackcalcdemo.services;

import com.example.chargebackcalcdemo.models.Employee;
import com.example.chargebackcalcdemo.models.EmployeeLogin;

public interface EmployeeServices {

	public boolean Login(EmployeeLogin employee);
	public int Register(Employee employee);
}
