package com.dhanush.teacher;

public class Teacher {
	void givespen(Student s1,Pen p1)
	{
		System.out.println("Teacher gives the pen");
		s1.receivespen(p1);
	}

}
