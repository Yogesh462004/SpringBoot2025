package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.nt.model.Employee;
@Repository("mysql")
@Profile("uat")
public class DaoimpMysql implements DAO {
	@Autowired
	private DataSource ds;

	@Override
	public List<Employee> getemp(int eno) throws Exception{
		List<Employee> emp=new ArrayList<>(); 
		try(Connection con=ds.getConnection();
				PreparedStatement ps=con.prepareStatement("SELECT EMPNAME,ESAL FROM EMP1 WHERE EMPNO=?")
				){
			ps.setInt(1, eno);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Employee emp1=new Employee();
				emp1.setName(rs.getString(1));
				emp1.setEsal(rs.getInt(2));
				emp1.setEno(eno);
				emp.add(emp1);
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		
		return emp;
	}

}
