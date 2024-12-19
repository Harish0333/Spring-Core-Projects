package com.nt.sbeans;

import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator 
{
	@Autowired //field Injection
	private  LocalDateTime dateTime;
	
	//b,method
	 public  String  showWishMessage(String user) 
	 {
		 System.out.println("WishMessageGenerator.showWishMessage() dateTime::"+dateTime);
		 //get current hour of the day
		 int hour=dateTime.getHour();
		 //generate wish MEssage
		 if(hour<12)
			   return "GM:"+user;
		 else if(hour>=12 && hour<16)
			   return "GA:"+user;
		 else if(hour>=16 && hour<20)
			    return "GE:"+user;
		 else 
			    return "GN:"+user;
	 }
}
