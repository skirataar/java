package com.dhanush.Employee;
import java.util.Scanner;


public class Main {
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		int n;
		System.out.println("enter no of employee details you are entering:");
		n=obj.nextInt();
		
		Employee emp[]=new Employee[n];
		for(int i=0;i<n;i++)
			emp[i]=new Employee();
		for(int i=0;i<n;i++)
			emp[i].getdata();
		for(int i=0;i<n;i++)
		emp[i].data(emp,n);
		for(int i=0;i<n;i++)
			emp[i].printdata();
	}
}
		