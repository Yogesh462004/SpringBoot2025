package com.nt.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties(prefix="org")
public class Employee {
	private String name;
	private int age;
	private String[] colors;
	private List<String> nicknames;
	private Set<Long> pn;
	private Map<String,Object> iddetails;
	private Company company;

}
