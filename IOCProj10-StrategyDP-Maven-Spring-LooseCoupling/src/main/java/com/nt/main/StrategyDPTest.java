package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.Flipkart;

public class StrategyDPTest {

	public static void main(String[] args) {
		
		//create  IOC container
		AnnotationConfigApplicationContext ctx=
				   new  AnnotationConfigApplicationContext(AppConfig.class);
	   //get target spring bean class obj ref
				Flipkart fpkt=ctx.getBean("fpkt",Flipkart.class);
		//invoke the b.method
		    String resultMsg=fpkt.shopping(new  String[] {"shirt","trouser","hat"},
		    		                                                     new float[] { 2000.0f,4000.0f,2000.0f});
		     System.out.println(resultMsg);
		     
 
		     //close container
		       ctx.close();
	}

}
