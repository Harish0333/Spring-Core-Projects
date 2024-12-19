package com.nt.main;

import java.time.LocalDateTime;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.nt.config.AppConfig;
import com.nt.sbeans.Wishmsg;

public class SetterInjection 
{
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext ctx=
				new AnnotationConfigApplicationContext(AppConfig.class);
		Wishmsg gen=ctx.getBean("wmsg",Wishmsg.class);
		//LocalDateTime d=LocalDateTime.of(1996, 04, 24, 07, 30);
		gen.setLdt(LocalDateTime.of(1996, 04, 24, 07, 30));
		String result=gen.generateWishMessage(); 
		System.out.println(result);
		 
		ctx.close();
	}
}
