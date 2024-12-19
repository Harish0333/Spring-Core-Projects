package com.nt.Main;

import com.nt.FDP.DataStructure;
import com.nt.FDP.Java;
import com.nt.FDP.OnlineCourse;
import com.nt.FDP.Python;

public class OptionChoose 
{
	
	public static OnlineCourse CourseSelection(String course)
	{
		if(course.equalsIgnoreCase("java"))
			return new Java();
		else if(course.equalsIgnoreCase("Python"))
			return new Python();
		else
			return new DataStructure();
	}
}
