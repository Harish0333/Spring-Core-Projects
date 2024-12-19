package com.nt.factory;

import com.nt.comps.AtherEletriceBike;
import com.nt.comps.Bike;
import com.nt.comps.Harley_DavidSonBike;
import com.nt.comps.Hero_Honda_Bike;

public class BikeFactory {
	
	//static public final method
	public static Bike getBikeInstance(String type) {
		   Bike bike=null;
		   if(type.equalsIgnoreCase("luxory"))
			     bike=new  Harley_DavidSonBike();
		   else if(type .equalsIgnoreCase("ecomony"))
			     bike=new Hero_Honda_Bike();
		   else if(type.equalsIgnoreCase("eletric"))
			   bike=new  AtherEletriceBike();
		   else
			    throw new IllegalArgumentException("Invlid  Bike tye");
		   return bike;
	}
}
