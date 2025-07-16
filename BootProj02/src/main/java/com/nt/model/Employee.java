package com.nt.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@PropertySource("classpath:com/nt/commons/myfile.properties")
public class Employee {
	@Value("${emp.eno}")
	private int eno;
	private int esal;
	private String name;

}
