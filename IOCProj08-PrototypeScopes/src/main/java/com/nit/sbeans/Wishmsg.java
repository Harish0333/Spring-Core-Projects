package com.nit.sbeans;

import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("wmsg")
@Scope("prototype")
@Lazy(true)
public class Wishmsg 
{
	@Autowired
	private LocalDateTime ldt;
	

	public Wishmsg(LocalDateTime ldt) 
	{
		System.out.println("Wishmsg.Wishmsg()");
		this.ldt=ldt;
	}

	@Override
	public String toString() {
		return "Wishmsg [ldt=" + ldt + "]";
	}
	
}
