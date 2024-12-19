package com.nt.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("fpkt")
public final class Flipkart {
	//HAS-A property
	
	//@Qualifier("dhl")
	//@Qualifier("${courier.id}")  --> invalid becoz  palce holder can be placed only in @Value annotation
	//@Qualifier("@Value('${courier.id}')")  //---> invalid becoz  @Value  can not be placed in @Qualifier
	@Value("${courier.id}")
	private String id;
	@Autowired
	//@Qualifier(id) // invalid  ---becoz  we can not pass  variable name  in @Qualifier annotation
	//@Qualifier(""+id) // invalid -- can not  do String contactination work  in the annotations
	@Qualifier("shipping")
	private ICourier  courier;
	
	public Flipkart() {
		System.out.println("Flipkart:: 0-param constructor");
	}
	
	//setter method  to assign  dependent class obj to tagret class obj
	public void  setCourier(ICourier courier) {
		System.out.println("Flipkart.setCourier()");
		this.courier=courier;
	}
	
	//b.method
	 public  String  shopping(String []items, float [] prices) {
		 System.out.println("Flipkart.shopping()");
		 //calculate bill amount
		 float amt=0.0f;
		 for(float p:prices) {
			 amt=amt+p;
		 }
		 //generate the  order id
		 int oid=new Random().nextInt(10000);
		 // deliver products using courier
		  String msg=courier.deliver(oid);
		  
		  return  Arrays.toString(items)+" are purchased having prices"+Arrays.toString(prices)+" billAmt::"+amt+"<---->"+msg;
		 
		 
	 }
	

}
