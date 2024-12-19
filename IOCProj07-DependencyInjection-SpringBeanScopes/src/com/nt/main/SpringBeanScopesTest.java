package com.nt.main;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.Printer;
import com.nt.sbeans.WishMessageGenerator;

public class SpringBeanScopesTest {

	public static void main(String[] args) {
		
		
		 Printer p1=Printer.getInstance();
		 Printer p2=Printer.getInstance();
		 System.out.println(p1.hashCode()+"  "+p2.hashCode());
		 System.out.println("p1==p2?"+(p1==p2));
		
		/*  System.out.println("---------------------------");
		  Date  d1=ctx.getBean("dt1",Date.class);
		  Date d2=ctx.getBean("dt2",Date.class);
		  System.out.println(d1.hashCode()+"  "+d2.hashCode());*/
		
		/* Printer p1=ctx.getBean("prn1",Printer.class);
		   Printer p2=ctx.getBean("prn2",Printer.class);
		   System.out.println(p1.hashCode()+"  "+p2.hashCode());
		*/          
                 
	}

}
