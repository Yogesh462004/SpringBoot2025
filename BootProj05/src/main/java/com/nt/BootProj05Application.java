package com.nt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nt.beans.Employee;

@SpringBootApplication
public class BootProj05Application implements CommandLineRunner {
@Autowired	
private Employee emp;
	public static void main(String[] args) {
		SpringApplication.run(BootProj05Application.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
     System.out.println(emp);		
	}

}
