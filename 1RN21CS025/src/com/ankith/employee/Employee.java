package com.dhanush.employee;
import java.util.*;
public class Employee 
{
    String name;
    int id;
    int exp;
    float sal;
    Scanner obj=new Scanner(System.in);
    
    void getdata()
    {
    	System.out.println("enter employee name:");
    	name=obj.next();

    	System.out.println("enter employee id:");
    	id=obj.nextInt();

    	System.out.println("enter employee experience:");
    	exp=obj.nextInt();

    	System.out.println("enter employee salary:");
    	sal=obj.nextFloat();
    	
    }
    void printdata()
    {
    	System.out.println("employee name:"+name);
    	System.out.println("employee id:"+id);
    	System.out.println("employee experience:"+exp);
    	System.out.println("employee salary:"+sal);
    }
    
    
}
