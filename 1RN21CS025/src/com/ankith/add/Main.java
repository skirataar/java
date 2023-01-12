package com.dhanush.add;

public class Main {
	public static void main(String args[])
	{
		addition add1=new addition();
		add1.getdata();
		addition add2=new addition();
		add2.getdata();
		addition result=new addition();
		result.display(add1.num,add2.num);
	}
}


