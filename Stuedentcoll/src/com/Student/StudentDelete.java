package com.Student;

import java.util.Scanner;

public class StudentDelete {
	
	void Delete()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER INDEX NUMBER");
		int re= sc.nextInt();
		
		StudentController scc= new StudentController();
		scc.al.remove(re);
		
		Studentshow stt= new Studentshow();
		stt.showdata();
	}

}
