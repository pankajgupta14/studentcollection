package com.Student;

import java.util.Scanner;

public class StudentInsertion {

	void inseert()  //insertion method
	{
		System.out.println("WHICH INSERTION YOU WANT PLEASE ENTER A NUMBER");
		System.out.println("1 =LAST ENSERTION");
		System.out.println("2 =MIDDLE INSERTION ");
		
		System.out.println("ENTER A NUMBER");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		switch (n) {
		case 1:  inputtt();
			break;
		case 2:  middle();
//				StudentController scc1 = new StudentController();
//		 		System.out.println(scc1.al);
		break;
//		case 2:
//			break ;
		default:
			System.out.println("Unexpected value: " + n);
			//throw new IllegalArgumentException("Unexpected value: " + n);
		}
	}
	
	void inputtt()
	{
		
		Studentinputdata si= new Studentinputdata();
		si.inputt();
//		StudentBean sb= new StudentBean();
//		
//		Scanner sc= new Scanner(System.in);
//		System.out.println("ENTER YOUR ROLL NUMBER");
//		int id= sc.nextInt();
//		sb.setId(id);
//		
//		Scanner sc1= new Scanner(System.in);
//		System.out.println("ENTER YOUR NAME ");
//		String name = sc1.nextLine();
//		sb.setName(name);
//		
//		Scanner sc2= new Scanner(System.in);
//		System.out.println("ENTER YOUR CITY NAME");
//		String city = sc2.nextLine();
// 
//		Studentoutput so=new Studentoutput();
//		so.Soutput();
//		so.data();
		StudentController sc= new StudentController();
		System.out.println(sc.al);
	}
	
	
	// for middle insertion
	void minputt()
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
		
//		String a=sb.getId()+sb.getName()+sb.getCity();
        		
//		//ArrayList<String> al= new ArrayList<>();
//		StudentController scc = new StudentController();
//		scc.al.add(a);
		
		
//		System.out.println(al);
		
//		Studentoutput so=new Studentoutput();
//		//so.Soutput();
//		so.data();
		
	}
	
	// for getting output
	String mSoutput()  // here 
	{
		StudentBean sb= new StudentBean();

		 int id=sb.getId();
		 String name =sb.getName();
	     String city = sb.getCity();
	     
		return "id "+id+"name "+name+"city "+city;
	}
	
	void mdata()
	{
		String hold=mSoutput();
		StudentController scc= new StudentController();
		String s1[ ] = {hold}; 
		
		// taking a input 
		System.out.println("ENTER INDEX NUMBER");
		Scanner in= new Scanner(System.in);
		int i=in.nextInt();
		//int ii=i-1;
		scc.al.add(i,s1);
		
		System.out.println(scc.al);
	}
		
	// this method for midddle insertion
	void middle()
	{
		minputt();
		//mSoutput();
		mdata();
//		StudentController scc= new StudentController();
//		System.out.println(scc.al);
	}
}
