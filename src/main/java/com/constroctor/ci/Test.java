package com.constroctor.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context =
				new ClassPathXmlApplicationContext("com/constroctor/ci/cianchal.xml");
		
//	 Person person=(Person)context.getBean("person");
//	 
//	 System.out.println(person);
//	 
//	 System.out.println("=============Certi==========Addded in bean============");
//	 
//	 Person person1=(Person)context.getBean("person1");
//	 
//	 System.out.println(person1);
//	 
//	 System.out.println("=============List added==========Addded in bean============");
//	 
	 Person person2=(Person)context.getBean("person4");
	 
	 System.out.println(person2);
	 
	 Addition add = (Addition)context.getBean("addition");
	 System.out.println(add);
	 add.doSum();
	}

}
