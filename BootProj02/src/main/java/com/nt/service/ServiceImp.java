package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.nt.dao.DAO;
import com.nt.model.Employee;

import jakarta.annotation.PostConstruct;
@Service
public class ServiceImp implements ServiceI {
	
	@Autowired
	private ApplicationContext ctx;

@Value("${db.dao}")
private String daoBeanName;
private DAO dao;
@PostConstruct
public void init() {
    this.dao = (DAO) ctx.getBean(daoBeanName);
}
	@Override
	public List<Employee> getemps(int no) throws Exception {
		List<Employee> emp=dao.getemp(no);
		return emp;
	}

}
