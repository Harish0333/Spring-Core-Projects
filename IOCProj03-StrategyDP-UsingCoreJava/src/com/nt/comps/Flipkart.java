package com.nt.comps;
import java.util.Arrays;
import java.util.Random;
///target
public final class Flipkart {
	//HAS-A property
	private ICourier courier;
	public Flipkart() 
	{
		System.out.println("Flipkart:: 0-param constructor");
	}
	//setter method  to assign  dependent class obj to tagret class obj
	public void  setCourier(ICourier courier) 
	{
		System.out.println("Flipkart.setCourier()");
		this.courier=courier;
	}
	//b.method
	 public String shopping(String []items, float [] prices) 
	 {
		 System.out.println("Flipkart.shopping()");
		 //calculate bill amount
		 float amt=0.0f;
		 for(float p:prices) 
		 {
			 amt=amt+p;
		 }
		 //generate the  order id
		 int oid=new Random().nextInt(10000);
		 // deliver products using courier
		 String msg=courier.deliver(oid);
		 return  Arrays.toString(items)+" are purchased having prices"+Arrays.toString(prices)+" billAmt::"+amt+"<---->"+msg;
	 }
}
