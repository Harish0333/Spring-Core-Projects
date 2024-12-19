package com.nt.appConfig;

import java.time.LocalDateTime;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.nt.sbeans")
public class AppConfig 
{
	 public AppConfig() 
	 {
		 System.out.println("AppConfig cons");		// TODO Auto-generated constructor stub
	 }
	 
	 @Bean(name="ldt")
	 public LocalDateTime ldt()
	 {
		return LocalDateTime.now();
	 }
}
