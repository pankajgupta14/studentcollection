package com.Student;

import java.util.ArrayList;

public class StudentController {

 static ArrayList al= new ArrayList<>();

	public static void main(String[] args) {
		
	 StudentController scc1 = new StudentController();
	 Studentinputdata sti=new Studentinputdata();
	 sti.time();
	 //System.out.println(al);  // this is for printing a linked list and data
	 
	 // for showing a data
//	 Studentshow ss= new Studentshow();
//	 ss.showdata();
	 
	 // insertion method
	 Studentmanipualtion sm=new Studentmanipualtion();
	 try {
			 sm.manipulate();
			 //System.out.println(al); 
	      }
	 catch (Exception e) {
		// TODO: handle exception
	           }
	 System.out.println(al);
	 
	}
}
