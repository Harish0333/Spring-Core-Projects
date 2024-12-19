package com.assign.main;
import com.assign.config.AppConfig;
import com.assign.sbeans.SeasonFinder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependencyInjection 
{
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext ctx=
				new AnnotationConfigApplicationContext(AppConfig.class);
		SeasonFinder generator=ctx.getBean("sf",SeasonFinder.class);
		String resultmsg=generator.search("Season");
		System.out.println("The Current season is "+resultmsg+".");
		ctx.close();
	}
}