package com.nt.sbeans;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmsg")
public class Wishmsg 
{
	public Wishmsg() 
	{
		System.out.println("WISH param Constructor");
	}
	 
	public LocalDateTime ldt;
	public Date date;
	
	@Autowired	//Setter injection
	public void setLdt(LocalDateTime ldt)
	{
		this.ldt=ldt;
	}
	
	@Autowired	//Setter injection
	public void setDate(Date date)
	{
		this.date=date;
	}

	public String generateWishMessage() {
		return "Wishmsg [LocalDateTime=" + ldt + ", \nDate=" + date + "]";
	}
	
	 
}
