package com.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("com/springcore/standalone/collection/standalonecollectionsanchalpal.xml");
		
		Person person =context.getBean("person",Person.class);
		
		System.out.println(person);
		System.out.println(person.getFriends().getClass().getTypeName());
		
		System.out.println("------------------------------------------------------");
		System.out.println(person.getFeestructure());
		System.out.println(person.getFeestructure().getClass().getName());
		
		System.out.println("------------------------------------------------------");
		System.out.println(person.getAddress());
		System.out.println(person.getAddress().getClass().getName());
		
		System.out.println("------------------------------------------------------");
		System.out.println(person.getProperties().getClass().getName());
	}

}
