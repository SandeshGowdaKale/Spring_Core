package com.seleiumexpress.ioc;

public class Vodafone implements Sim {

	public void call() {
		System.out.println("Calling using Vodafone Sim");
	}

	public void data() {
		System.out.println("Browseing using Vodafone Sim");
	}

}
