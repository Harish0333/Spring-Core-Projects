package com.nt.main;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {

	public static void main(String[] args) {
	
		  AnnotationConfigApplicationContext ctx=
				   new AnnotationConfigApplicationContext(AppConfig.class);
		  //get target spring bean class  object ref
		 WishMessageGenerator generator=ctx.getBean("wmg",WishMessageGenerator.class);
		
		 //invoke the b.method
		  String resultMsg=generator.showWishMessage("Harish");
		  System.out.println(resultMsg);
		  
		  //close the container
		  ctx.close();
      
	}
}
