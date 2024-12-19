package com.nt.client;

import com.nt.comps.Bike;
import com.nt.factory.BikeFactory;

public class FactoryDPTest {

	public static void main(String[] args) {
		Bike bike1=BikeFactory.getBikeInstance("luxory");
		bike1.drive();
		System.out.println("========================");
		Bike bike2=BikeFactory.getBikeInstance("ecomony");
		bike2.drive();
		System.out.println("=====================");
		Bike bike3=BikeFactory.getBikeInstance("eletric");
		bike3.drive();
		
	}
}
