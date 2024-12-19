package com.assign.sbeans;

import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeasonFinder 
{
	@Autowired
	private LocalDate mon;
	
	public String search(String sea)
	{
		int month=mon.getMonthValue();
		if(month<=3 || month ==10)
			return "Winter "+sea;

		else if(month>=4 && month <=7)
			return "Summer "+sea;
		
		else if(month>7 && month <=9)
			return "Rainy "+sea;
		else
			return "Null";
	}
}
