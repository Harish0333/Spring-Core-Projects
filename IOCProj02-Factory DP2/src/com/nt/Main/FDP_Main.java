package com.nt.Main;

import com.nt.FDP.OnlineCourse;

public class FDP_Main {

	public static void main(String[] args) 
	{
		OnlineCourse oc =OptionChoose.CourseSelection("java");
		System.out.println(oc.getDetails());

	}

}
