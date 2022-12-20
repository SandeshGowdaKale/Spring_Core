package com.seleiumexpress.ioc;

public class Airtel implements Sim {

	public Airtel() {
		System.out.println("Airtel Constructor Calling");
	}
	
	public void call() {
		System.out.println("Calling using Airtel Sim");
	}

	public void data() {
		System.out.println("Browseing using Airtel Sim");
	}

}
