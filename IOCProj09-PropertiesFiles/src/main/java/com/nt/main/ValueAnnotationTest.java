package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import com.nt.config.AppConfig;
import com.nt.sbeans.PersonInfo;
import com.nt.sbeans.TestBean;

public class ValueAnnotationTest {

	public static void main(String[] args) {
		//create IOC container
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		//get SpringBean class obj ref
		PersonInfo info=ctx.getBean("pInfo",PersonInfo.class);
		System.out.println(info);
		
		System.out.println("=========================");
		
		Environment  env=ctx.getEnvironment();
		System.out.println("system  proeprty os name::"+env.getProperty("os.name"));
		
		System.out.println("=====================");
		TestBean tb=ctx.getBean("testBean",TestBean.class);
		 tb.display();
		
		
		//close the IOC container
		ctx.close();
		

	}

}
