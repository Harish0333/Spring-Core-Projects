package com.nt.client;

import com.nt.comps.Flipkart;
import com.nt.factory.FlipkartFactory;
//CLient application
public class StrategyDPTest 
{
	public static void main(String[] args) 
	{
		//get Target class obj  from the factory 
		Flipkart  fpkt=FlipkartFactory.getInstance("bDart");
		//invoke the b.method
		String resultMsg=fpkt.shopping(new String[] {"shirt","trouser","hat"},
				                                                      new float[] {3000.0f, 5000.0f, 1000.0f});
		System.out.println(resultMsg);
	}
}
