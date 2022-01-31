package com.springcore.lifecycle;

import org.springframework.util.SocketUtils;

public class Samosa {
	
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		
		System.out.println("setting property for price ");
		this.price = price;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	public void init(){
		System.out.println(" Inside init method ");
	}
	
	public void destroy(){
		System.out.println(" Inside destroy method");
	}
	
//  public static void main(String[] args) {
//	System.out.println("Hello");
//}
}
