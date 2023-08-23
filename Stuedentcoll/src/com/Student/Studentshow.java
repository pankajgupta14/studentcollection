package com.Student;

import java.util.Iterator;

public class Studentshow {
	
	void showdata()
	{
		 StudentController scc1 = new StudentController();
		 Iterator itr=scc1.al.iterator();
		 
		 System.out.println("\n--------------------Deatils---------------------\n");
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }
		 System.out.println("\n-------------------------------------------------\n");
	}

}
