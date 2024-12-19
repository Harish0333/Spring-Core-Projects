package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.CheckVotingElgibility;

public class SpringBeanLifeCycleTest {

	public static void main(String[] args) {
		//create the IOC container
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		//get spring bean
		CheckVotingElgibility  voting=ctx.getBean("voter",CheckVotingElgibility.class);
		//invoke the method
		String msg=voting.checkElgibility();
		System.out.println(msg);
		
		//close the container
		 ctx.close();

	}

}
