package com.nani.interfacee;

public class Teacher implements Getters {
	
	public void bioData(
			// Data Members for Teacher (Personal Information)
			String name,
			int age,
			
			//Data Members for Teacher (Qualification)
			String qualification,
			
			//Data Members for Teacher (Experience)
			double exp,
			
			//Data Members for Teacher (Achievements)
			int achievements,
			
			//Data Members for Student (Result)
			double percentage,
			
			//Data Members for Student (Discipline)
			String grade)
	{
		System.out.println("PERSONAL INFORMATION: \n1) NAME :"+name+"\n2) AGE :"+age);
		System.out.println("QUALIFICATION :"+qualification);
		System.out.println("EXPERIENCE: "+exp);
		System.out.println("ACHIEVEMENT: "+achievements);
	}

}
