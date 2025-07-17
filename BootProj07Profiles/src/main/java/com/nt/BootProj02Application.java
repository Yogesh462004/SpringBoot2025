package com.nt;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.controller.Cont1;
import com.nt.model.Employee;

@SpringBootApplication
public class BootProj02Application {

	public static void main(String[] args) throws Exception {
		ApplicationContext ctx=SpringApplication.run(BootProj02Application.class, args);
		Cont1 c=ctx.getBean("cont1",Cont1.class);
		Employee e=ctx.getBean("employee",Employee.class);
		System.out.println("Hello");
		List<Employee> emp=c.getcontemp(e.getEno());
		emp.forEach(l->{
			System.out.println(l);
		});
		
	}

}
