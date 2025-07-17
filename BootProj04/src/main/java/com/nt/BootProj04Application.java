package com.nt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nt.beans.Student;

@SpringBootApplication
public class BootProj04Application implements CommandLineRunner {
@Autowired	
private Student st;
	public static void main(String[] args) {
		SpringApplication.run(BootProj04Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(st);
		
	}

}
