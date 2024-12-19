package com.nt.comps;


public class Hero_Honda_Bike implements Bike {
	
	public Hero_Honda_Bike() {
		System.out.println("Honda Bike :: 0-param constrcutor");
	}

	@Override
	public void drive() {
		System.out.println("Honda Bike:: driving the honda bike");

	}

}
