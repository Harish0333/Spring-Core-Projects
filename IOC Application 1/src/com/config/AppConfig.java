package com.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.sbeans")
public class AppConfig 
{
	@Bean(name="dt")
	public LocalDateTime CreateLDT()
	{
		return LocalDateTime.now();
	}
	
}
