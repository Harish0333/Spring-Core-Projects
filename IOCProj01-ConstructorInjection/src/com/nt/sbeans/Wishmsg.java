package com.nt.sbeans;

import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmsg")
public class Wishmsg 
{
	public LocalDateTime ldt;
	
	@Autowired
	public Wishmsg(LocalDateTime ldt) 
	{
		System.out.println("wish msg 1 param constructor");
		this.ldt=ldt;
	}

	@Override
	public String toString() {
		return "Wishmsg [ldt=" + ldt + "]";
	}
	
}
