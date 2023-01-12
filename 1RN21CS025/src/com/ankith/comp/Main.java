package com.dhanush.comp;

public class Main {
	public static void main(String[] args)
	{
	   Complex c1=new Complex(7.5,1.5);
	   Complex c2=new Complex(2.5,8.5);
	   Complex c3=new Complex();
	   c3=c1.add_Complex(c2);
       System.out.println("The sum of the complex number is "+c3.real+" + i "+c3.imag);
	}
}
