package com.dhanush.add;
import java.util.*;
public class addition 
{
	Scanner obj=new Scanner(System.in);
	int num;
	public void getdata()
	{
		System.out.println("enter a number");
		num=obj.nextInt();
		
	}
	public void display(int num1,int num2)
	{
		System.out.println("The sum of two numbers is "+(num1+num2));
	}
}
