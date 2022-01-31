package com.constroctor.ci;

import java.util.List;

public class Person {

	 private String name;
	 private int pId;
	 private Certi certi;
	 private List<Emp> list; 
	public Person(String name, int pId) {
		super();
		this.name = name;
		this.pId = pId;
	}
	
	public Person(String name, int pId, Certi certi) {
		super();
		this.name = name;
		this.pId = pId;
		this.certi = certi;
	}

	
	public Person(String name, int pId, Certi certi, List<Emp> list) {
		super();
		this.name = name;
		this.pId = pId;
		this.certi = certi;
		this.list = list;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", pId=" + pId + ", certi=" + certi
				+ ", list=" + list + "]";
	}

	 
}
