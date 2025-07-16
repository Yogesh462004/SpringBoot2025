package com.nt.dao;

import java.util.List;

import com.nt.model.Employee;

public interface DAO {
	public List<Employee> getemp(int eno) throws Exception;

}
