package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecylanchal.xml");
		
		context.registerShutdownHook();
//		Samosa samosa = (Samosa)context.getBean("samosa");
//		
//		System.out.println(samosa);
		
		
//		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
//		
//		Pepsi p1 =(Pepsi)context.getBean("pepsi");
//		System.out.println(p1);
		
		Example example =(Example) context.getBean("example");
		System.out.println(example);
	}

}
