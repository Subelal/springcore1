package com.springcore.accessSpecifier;

import com.springcore.*;

public class ProtectedUseMethod 
extends Protected
{
	
	public static void main(String[] args) {
		ProtectedUseMethod obj = new ProtectedUseMethod();
		obj.display();
//		num=14;
		System.out.println(obj.num);
	}

}
