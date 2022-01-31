package com.springcore;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
//        ApplicationContext context =
//        		 new ClassPathXmlApplicationContext("anchal.xml");
//        
//        Student student =(Student)context.getBean("student");
//        System.out.println(student);
//        
//        Student student1 =(Student)context.getBean("student1");
//        System.out.println(student1);
        reverseNum(123);
        
        }
    
    	 
    	 public static void reverseNum(int num){
    		 
    		int reverse =0;
    		while(num !=0){
    			
    			reverse = reverse*10+num%10;
    			num=num/10;
    			
    		}
    		System.out.println(reverse);
    		
    	 }
}


class Employee{
	
	private String fname;
	private String 	lname;
	public Employee(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
		
		System.out.println("No args");
	}



	@Override
	public String toString() {
		return "Employee [fname=" + fname + ", lname=" + lname + "]";
	}
	
	
	
}