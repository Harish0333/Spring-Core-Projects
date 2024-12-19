package com.nt.main;
import java.util.Date;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.nt.config.AppConfig;
import com.nt.sbeans.Printer;

public class SpringBeanScopesTest {

	public static void main(String[] args) {
		System.out.println("DependencyInjectionTest.main()==>Start");
		//create  IOC container
		AnnotationConfigApplicationContext  ctx=new AnnotationConfigApplicationContext(AppConfig.class);
			
		System.out.println("---------------------------");
		Date d1=ctx.getBean("dt1",Date.class);
		Date d2=ctx.getBean("dt2",Date.class);
		System.out.println(d1.hashCode()+"  "+d2.hashCode());
		    
		System.out.println("---------------------------");
		Printer p1=ctx.getBean("prn1",Printer.class);
		Printer p2=ctx.getBean("prn2",Printer.class);
		System.out.println(p1.hashCode()+"  "+p2.hashCode());
		
		//close the container
		ctx.close();
		System.out.println("DependencyInjectionTest.main()===>end");                 
	}
}
