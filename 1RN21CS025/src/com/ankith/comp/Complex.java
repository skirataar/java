package com.dhanush.comp;

public class Complex
{
   double real;
   double imag;
   public Complex()
   {
	   
   }
   public Complex(double real,double imag)
   {
	   this.real=real;
	   this.imag=imag;
	   
   }
   public Complex add_Complex(Complex obj)
   {
	   Complex temp=new Complex();
	   temp.real=real+obj.real;
	   temp.imag=imag+obj.imag;
	   return temp;
   }
}
