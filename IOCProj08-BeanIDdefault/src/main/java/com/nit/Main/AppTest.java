package com.nit.Main;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.nit.Appconfig.AppConfig;
import com.nit.sbeans.Wishmsg;

public class AppTest
{
    public static void main(String[] args) 
    {
    	AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	//Wishmsg gen1=ctx.getBean("wmsg",Wishmsg.class);
    	Wishmsg gen1=ctx.getBean("wishmsg",Wishmsg.class);
    	 System.out.println("All bean ids are ::"+Arrays.toString(ctx.getBeanDefinitionNames()));
    	ctx.close();
    	
    }
}
