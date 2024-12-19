package com.nt.factory;

import com.nt.comps.BlueDart;
import com.nt.comps.DHL;
import com.nt.comps.DTDC;
import com.nt.comps.Flipkart;
import com.nt.comps.ICourier;

//factory pattern class
public class FlipkartFactory 
{
	//static factory method
	public  static  Flipkart  getInstance(String courierType) {
		   //create one of the dependent classs obj based on the courier type
		     ICourier courier=null;
		   if(courierType.equalsIgnoreCase("dtdc"))
			     courier=new DTDC();
		   else if(courierType.equalsIgnoreCase("bDart"))
			       courier=new BlueDart();
		   else if(courierType.equalsIgnoreCase("dhl"))
			       courier=new DHL();
		   else 
			   throw new IllegalArgumentException("Invalid  Courier Type");
		   //create  target class object
		    Flipkart fpkt=new Flipkart();
		    //assign courier to  target class obj
		    fpkt.setCourier(courier);
		   //return Flipkart class obj
		      return fpkt;
			}//method
}//class
