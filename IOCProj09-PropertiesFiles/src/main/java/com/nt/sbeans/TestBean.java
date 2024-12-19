package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class TestBean {
	@Autowired
private Environment  env;
	
	public void display() {
		System.out.println("data is ::"+env.getProperty("os.name"));
	}
}
