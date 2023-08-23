package com.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Studentinputdata {

	void time()
	{
		Scanner sc= new Scanner(System.in);
		
		// entring  a number for how many data need then ist loop for entrying a data
		System.out.println(" HOW MANY DATA YOU WANT TO ENTER  , PLEASE ENTER A NUMBER");
		int n= sc.nextInt();
		String [] s1=null;
		
		Studentoutput so=new Studentoutput();  // contructor for callin another class method 
		//StudentBean sb= new StudentBean();
		for(int i =1; i<=n ; i++)
		{
			inputt();  // using this method we enter a data
			//so.Soutput();
			//so.data();
		}
		
		System.out.println("enter next step");
		String x = sc.next();
		
		if(x.equals("show"))
		{
			Studentshow ss = new Studentshow();
			
			ss.showdata();
		}
		
	}	
	
	// this mthod for using a data
	void inputt()
	{
		StudentBean sb= new StudentBean();
		
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER YOUR ROLL NUMBER");
		int id= sc.nextInt();
		sb.setId(id);
		
		Scanner sc1= new Scanner(System.in);
		System.out.println("ENTER YOUR NAME ");
		String name = sc1.nextLine();
		sb.setName(name);
		
		Scanner sc2= new Scanner(System.in);
		System.out.println("ENTER YOUR CITY NAME");
		String city = sc2.nextLine();
		sb.setCity(city);
		
		StudentController.al.add(sb);
		
//		String a=sb.getId()+sb.getName()+sb.getCity();
        		
//		//ArrayList<String> al= new ArrayList<>();
//		StudentController scc = new StudentController();
//		scc.al.add(a);
		
		
//		System.out.println(al);
		
//		Studentoutput so=new Studentoutput();
//		//so.Soutput();
//		so.data();
		
	}
}
