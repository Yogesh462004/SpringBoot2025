package com.nt;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.beans.Wish;

@SpringBootApplication
public class BootProj01Application {
	@Bean
	public LocalDateTime ldt() {
		return LocalDateTime.now();
	}

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootProj01Application.class, args);
	
		Wish w=ctx.getBean("wish",Wish.class);
		System.out.println(w.msg());
	}

}
