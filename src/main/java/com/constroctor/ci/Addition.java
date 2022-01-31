package com.constroctor.ci;

public class Addition {
	
	private int a;
	private int b;
	
	

	
	Addition(int a, int b){
		this.a = a;
		this.b = b;
		
		System.out.println("Constructor with (int,int) ");
	}
	
	Addition(double a, double b){
		this.a =(int) a;
		this.b = (int)b;
		
		System.out.println("Constructor with (double,double) ");
	}
//	Addition(String a ,String b){
//		this.a = Integer.parseInt(a);
//		this.b = Integer.parseInt(b);
//		
//		System.out.println("Constructor with (String,String)");
//	}
	
	
	public void doSum(){
		System.out.println("The value of a "+this.a);
		System.out.println("The value of b "+this.b);
		System.out.println("Addition is "+(this.a+this.b));
	}

//	@Override
//	public String toString() {
//		return "Addition [a=" + a + ", b=" + b + "]";
//	}

	
}
