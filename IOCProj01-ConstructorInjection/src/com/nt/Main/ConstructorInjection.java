package com.nt.Main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.nt.appConfig.AppConfig;
import com.nt.sbeans.Wishmsg;

public class ConstructorInjection 
{
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		Wishmsg gen=ctx.getBean("wmsg", Wishmsg.class);
		String result=gen.toString();
		System.out.println(result);
		ctx.close();
	}
}
