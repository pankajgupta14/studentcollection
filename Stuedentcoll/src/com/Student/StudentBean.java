package com.Student;

import java.util.Scanner;


// here all the value is mad efor sharing wp
public class StudentBean {

	private int id;
	private String name;
	private String city;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() 
	{
		return  id + "	" + name + "		" + city ;
	}
	
	
	
	
	
//	public StudentBean() {
//		super();
//		
//		Scanner sc=new Scanner(System.in);
//    	System.out.println("ENTER YOUR NUMBER");
//    	id=sc.nextInt();
//    	this.id=id;
//    	
//    	//Scanner sc1=new Scanner(System.in);
//    	System.out.println("ENTER YOUR NAME");
//    	name=sc.nextLine();
//    	this.name=name;
//    	
//    	//Scanner sc2=new Scanner(System.in);
//    	System.out.println("ENTER YOUR CITY");
//    	city=sc.nextLine();
//    	this.city=city;
		
	}
	  
	
	
	
	

