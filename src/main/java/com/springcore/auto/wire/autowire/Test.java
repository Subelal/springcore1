package com.springcore.auto.wire.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context =
				new ClassPathXmlApplicationContext("com/springcore/auto/wire/autowire/autowireanchal.xml");
		
//		  Address address =(Address) context.getBean("address");
//		  System.out.println(address);
		  
		 Employee emp1=  context.getBean("emp",Employee.class);
		 System.out.println(emp1);
	}

}
