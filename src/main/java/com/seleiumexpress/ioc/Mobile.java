package com.seleiumexpress.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		// now without touching source code we have configure
		// with the help of Spring

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Config Loaded");

		Vodafone vodafone = context.getBean("vodafone", Vodafone.class);
		vodafone.call();
		vodafone.data();

	}
}
