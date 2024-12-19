package nit.Main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import nit.Config.AppConfig;
import nit.sbeans.ChooseOptions;

public class SDPMain {

	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		ChooseOptions COO=ctx.getBean("CO",ChooseOptions.class);
		String Result=COO.Choice();
		System.out.println(Result);
		ctx.close();
	}
}
