package com.seleiumexpress.ioc;

public class Mobile {
	
	public static void main(String[] args) {
		//Note: not a Good practice because every time we have to write again and again
		
		Airtel airtel = new  Airtel();
		airtel.call();
		airtel.data();
		
		System.out.println("-----------------------------------------------");
		
		Vodafone vodafone = new Vodafone();
		vodafone.call();
		vodafone.data();  
		System.out.println("-----------------------------------------------");

		//Good Practice
		
		Sim sim = new Airtel();  //only i have change here vodaphone,Jio
		sim.call();
		sim.data();	
	}
}
