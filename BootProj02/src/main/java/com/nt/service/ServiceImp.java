package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.DAO;
import com.nt.model.Employee;
@Service
public class ServiceImp implements ServiceI {
@Autowired	
private DAO dao;
	@Override
	public List<Employee> getemps(int no) throws Exception {
		List<Employee> emp=dao.getemp(no);
		return emp;
	}

}
