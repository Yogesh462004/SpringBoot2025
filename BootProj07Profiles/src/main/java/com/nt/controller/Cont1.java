package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Employee;
import com.nt.service.ServiceI;

@Controller
public class Cont1 {
	@Autowired
	private ServiceI ser;
	public List<Employee> getcontemp(int no) throws Exception{
		return(ser.getemps(no));
	}

}
