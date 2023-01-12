package com.dhanush.Employee;
import java.util.Scanner;
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
    public static void data(Employee emp[],int n)
    {
    	Employee temp=new Employee();
    	int i,j;
    	
    	for(i=0;i<n-1;i++)
    	{
    		for(j=0;j<n-i-1;j++)
    		{
    			if(emp[j].exp>emp[j+1].exp)
    			{
    				temp=emp[j];
    				emp[j]=emp[j+1];
    				emp[j+1]=temp;
    			}
    		}
    	}
    }
    void printdata()
    {
    	System.out.println("employee name:"+name);
    	System.out.println("employee id:"+id);
    	System.out.println("employee experience:"+exp);
    	System.out.println("employee salary:"+sal);
    }
    
    
}