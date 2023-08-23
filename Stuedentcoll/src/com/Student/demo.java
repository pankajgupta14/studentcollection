package com.Student;

public class demo {

	String d()
	{
		System.out.println("d");
		return "a";
	}
	
	void dd()
	{
		String a=d();
		System.out.println("dd");
	}
	public static void main(String[] args) {
		demo d=new demo();
		d.dd();
	}
}
