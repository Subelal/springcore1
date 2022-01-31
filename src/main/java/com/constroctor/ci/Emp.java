package com.constroctor.ci;

public class Emp {
	
	private int empId;
	private String fname;
	private String lname;
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(int empId, String fname, String lname) {
		super();
		this.empId = empId;
		this.fname = fname;
		this.lname = lname;
	}
	@Override
	public String toString() {
		return "Emp {empId=" + empId + ", fname=" + fname + ", lname=" + lname
				+ "}";
	}
	
	

}
