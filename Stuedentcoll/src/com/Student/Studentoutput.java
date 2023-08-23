package com.Student;

public class Studentoutput {
	
	
	//String hold=Soutput();
	
	String Soutput()  // here 
	{
		StudentBean sb= new StudentBean();

		 int id=sb.getId();
		 String name =sb.getName();
	     String city = sb.getCity();
	     
		return "id "+id+"name "+name+"city "+city;
	}
	
	void data()
	{
		String hold=Soutput();
		StudentController sc= new StudentController();
		String s1[ ] = {hold}; 
		sc.al.add(s1);
	}

}
