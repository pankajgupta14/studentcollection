package com.Student;

import java.util.Scanner;

public class Studentmanipualtion {

	 void manipulate()
	{
		System.out.println("IF YOU WANT TO ENTER , DELETE , UPDATE A DATA PLEAE ENTER  Y= YES , N= NO");
		Scanner sc=new Scanner(System.in);
		String in=sc.next();
		String s1="y";
		if(s1.equalsIgnoreCase(in))
		{
			System.out.println("CHECK AND ENTER CORRECT NO.");
			System.out.println("1 = INSERT MORE DATA");
			System.out.println("2 = REPLACE A DATA");
			System.out.println("3 = DELETE A DATA");
			
			//Scanner sc= new Scanner(System.in);
			System.out.println("");
			System.out.println("ENTER A NUMBER ");
			int n=sc.nextInt();
			
			//object of diffrent classes
			StudentInsertion si=new StudentInsertion();
			//StudentInsertion si= new StudentInsertion();
			 //si.inputt();
			StudentReplace sr= new StudentReplace();
			
			switch (n) {
			case 1: si.inseert();
			break ;
			case 2: sr.RR();;
			break ;
			
			
 
				
			default:
				System.out.println(" PLEASE INTER CORRECT NUMBER" + n);
			}
			
			
		}
		else
		{
			System.out.println("Thank you!");
		}
		
	}
	 
}
