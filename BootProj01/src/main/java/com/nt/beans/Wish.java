package com.nt.beans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Wish {
@Autowired	
private LocalDateTime ld;
public String msg() {
	int hours=ld.getHour();
	return "THIS IS TIME NOW::"+hours;
}
}
