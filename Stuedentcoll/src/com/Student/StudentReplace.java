package com.Student;

import java.util.Scanner;

public class StudentReplace {
	
	String  rreplace()
	{
		// for input a data
		StudentBean sb= new StudentBean();
		System.out.println("IF YOU WANT TO REPLACE THE DATA PLEASE ENTER YOUR DATA");
		System.out.println("PLEASE ENTER YOUR RIGHT ROLL NO.");
		
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER YOUR currect ROLL NUMBER");
		int id= sc.nextInt();
		sb.setId(id);
		
		Scanner sc1= new Scanner(System.in);
		System.out.println("ENTER YOUR NAME ");
		String name = sc1.nextLine();
		sb.setName(name);
		
		return "a";
//		Scanner sc2= new Scanner(System.in);
//		System.out.println("ENTER YOUR CITY NAME");
//		String city = sc2.nextLine();
	}
	
	void RR() {
		String a=rreplace();
		
		Studentoutput stt= new Studentoutput();
		String rep=stt.Soutput();
		String [ ]  aa= {rep};
		
		StudentBean sb= new StudentBean();
		 int iid=sb.getId();
		
		StudentController sct= new StudentController();
		sct.al.set(iid, sct);
		
		//System.out.println(sct.al);
		Studentshow sts= new Studentshow();
		sts.showdata();
		
	}
	
	

}
