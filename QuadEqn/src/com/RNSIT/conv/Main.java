package com.RNSIT.conv;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter \n1.Currency\n2.Time\n3.Distance");
		int c=sc.nextInt();
		switch(c) {
		case 1: currConv obj1 = new currConv();
				obj1.getData();
				obj1.calc();
				obj1.display();
		break;
		
		case 2: timeConv obj2 = new timeConv();
				obj2.getData();
				obj2.convert();
				obj2.display();
		break;
		case 3: distConv obj3 =  new distConv();
				obj3.getData();
				obj3.convertDist();
				obj3.display();
		break;
		
		default: System.out.println("valid");
		}
		

	}

}
