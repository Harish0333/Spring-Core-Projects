package com.assign.config;

import java.time.LocalDate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan(basePackages="com.assign.sbeans")
public class AppConfig 
{
	@Bean("dt")
	public LocalDate Createdate()
	{
		System.out.println("Cuurent date :"+LocalDate.now());
		return LocalDate.now();
	}
}
