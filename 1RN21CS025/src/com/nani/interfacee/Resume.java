package com.nani.interfacee;

import java.util.Scanner;

public class Resume {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		Teacher obj1 = new Teacher();
		Student obj2 = new Student();
		
		
		String name;
		
		int age;
		
		//Data Members for Teacher (Qualification)
		String qualification;
		
		//Data Members for Teacher (Experience)
		double exp;
		
		//Data Members for Teacher (Achievements)
		int achievements;
		
		//Data Members for Student (Result)
		double percentage;
		
		//Data Members for Student (Discipline)
		String grade;
		
		int checker = 1;
		while(checker != 0)
		{
			int choice;
			choice = scn.nextInt();
			
			switch(choice)
			{
			case 1: obj1.bioData(name = scn.next(),
					age = scn.nextInt(),
					qualification = scn.next(),
					exp = scn.nextDouble(),
					achievements = scn.nextInt(),
					percentage = scn.nextDouble(),
					grade = scn.next());
			break;
			
			case 2: obj2.bioData(name = scn.next(),
					age = scn.nextInt(),
					qualification = scn.next(),
					exp = scn.nextDouble(),
					achievements = scn.nextInt(),
					percentage = scn.nextDouble(),
					grade = scn.next());
			break;
			
			default: checker = 0;
			}
		}
		
		scn.close();
	}

}
