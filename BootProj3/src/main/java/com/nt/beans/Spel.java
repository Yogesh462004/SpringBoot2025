package com.nt.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Spel {
	 @Value("${app.name}")
	    private String appName;

	    @Value("#{${app.users}*2}")
	    private int doubleUsers;

	    @Value("#{${app.users} + ${app.rate}}")
	    private double total;

}
