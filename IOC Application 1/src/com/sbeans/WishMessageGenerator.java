package com.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator 
{
	@Autowired
	private LocalDateTime dateTime;
	
	public String showWishMessage(String user)
	{
		int hour=dateTime.getHour();
		if(hour<12)
			return "Good Mornig :"+user;

		else if(hour>=12 && hour<16)
			return "Good Afternoon :"+user;
		
		else if(hour>=16 && hour<20)
			return "Good Evening :"+user;
		else
			return "Good Night :"+user;
	}

}
