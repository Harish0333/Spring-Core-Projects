package com.nt.config;
import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import com.nt.sbeans.Printer;

@Configuration
@ComponentScan(basePackages="com.nt.sbeans")
public class AppConfig {
	
	public AppConfig() {
		System.out.println("AppConfig:: 0-param constructor");
	}

	 @Bean(name="prn1")
	public Printer createprn() {
		System.out.println("AppConfig.Printer()");
		return Printer.getInstance();
	}
	 
	 @Bean(name="prn2")
		public Printer createprn2() {
			System.out.println("AppConfig.Printer()");
			return Printer.getInstance();
		}
	
	@Bean(name="dt1")
	@Scope("singleton")
	@Lazy(true)
	 public  Date createDate1() {
		System.out.println("AppConfig.createDate()1");
		 return  new Date();
	 }
	
	@Bean(name="dt2")
	@Scope("singleton")
	@Lazy(true)
	 public  Date createDate2() {
		System.out.println("AppConfig.createDate()2");
		 return  new Date();
	 }
	
}
