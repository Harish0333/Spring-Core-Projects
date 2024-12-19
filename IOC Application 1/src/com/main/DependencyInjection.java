package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.sbeans.*;
import com.config.AppConfig;

public class DependencyInjection {

	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext ctx=
				new AnnotationConfigApplicationContext(AppConfig.class);
		WishMessageGenerator generator=ctx.getBean("wmg",WishMessageGenerator.class);
		String resultmsg=generator.showWishMessage("Harish");
		System.out.println(resultmsg);
		ctx.close();
	}

}
