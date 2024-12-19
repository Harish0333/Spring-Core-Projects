package com.nt.config;

import java.time.LocalDateTime;
import java.util.Date;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.nt.sbeans")

public class AppConfig 
{
	public AppConfig() 
	{
		System.out.println("AppCOnfig Constructor");
	}
	
	@Bean(name = "LDT")
    public LocalDateTime ldt() {
		return LocalDateTime.now();
	}
	@Bean(name = "date")
    public Date date() 
	{
    	return new Date();
    }
}
