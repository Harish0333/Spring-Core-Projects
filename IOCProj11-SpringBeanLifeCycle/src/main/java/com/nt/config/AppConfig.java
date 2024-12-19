package com.nt.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@ComponentScan(basePackages = "com.nt.sbeans")
@PropertySource("com/nt/commons/myfile.properties")
@Configuration
public class AppConfig {

}
