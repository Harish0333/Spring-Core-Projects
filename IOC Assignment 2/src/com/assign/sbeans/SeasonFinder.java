package com.assign.sbeans;

import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("sf")
public class SeasonFinder 
{
	@Autowired
	private LocalDate Day;
	public String search()
	{
		int day=Day.getDayOfWeek().getValue();
		if(day==1)
			return "Monday,a weekday.";
		
		else if(day==2)
			return "Tuesday,a weekday.";
		
		else if(day==3)
			return "Wednesday,a weekday.";
		
		else if(day==4)
			return "Thrusday,a weekday.";
		
		else if(day==5)
			return "Friday,a weekday.";

		else if(day==7)
			return "Saturday,a weekend day.";
		else
			return "Sunday,a weekend day.";
	}	
}
