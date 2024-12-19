package com.nit.Appconfig;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.nit.sbeans")
public class AppConfig 
{

	//@Bean(name="ldt")
	@Bean
	public LocalDateTime LDT()
	{
		return LocalDateTime.now();
	}

}
