package com.nit.Main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.nit.Appconfig.AppConfig;
import com.nit.sbeans.Wishmsg;

public class PrototypeApp 
{
    public static void main(String[] args) 
    {
    	AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
    	Wishmsg gen1=ctx.getBean("wmsg",Wishmsg.class);
    	Wishmsg gen2=ctx.getBean("wmsg",Wishmsg.class);
    	Wishmsg gen3=ctx.getBean("wmsg",Wishmsg.class);
    	
    	System.out.println(gen1.hashCode()+" "+gen2.hashCode()+" "+gen3.hashCode());
    	System.out.println("gen1==gen2 ? "+ (gen1==gen2));
    	System.out.println("gen2==gen3 ? "+ (gen2==gen3));
    	ctx.close();
    	
    }
}
