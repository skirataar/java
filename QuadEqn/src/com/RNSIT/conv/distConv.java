package com.RNSIT.conv;
import java.util.Scanner;

public class distConv {
	private
	double dist;
	char src,dest;
	
	public
	Scanner sc = new Scanner(System.in);
	
	void getData() {
		System.out.println("Enter M-miles/m-meters/K-kilometers");
		System.out.println("Enter source ");
		src=sc.next().charAt(0);
		System.out.println("Enter destination ");
		dest=sc.next().charAt(0);
		System.out.println("Enter Distance: ");
		dist=sc.nextDouble();
	}
	void convertDist() {
		if (src=='K')
			switch(dest) {
			case 'm': dist/=1000;
			break;
			
			case 'M': dist*=0.621;
			break;
			
			default: System.out.println("Enter valid option");
			}
		else if(src=='M')
			dist=dist/0.621;
		else if(src=='m')
			dist=dist/1000;
		else
			System.out.println("Enter the valid option");
	}
	void display() {
		System.out.println(dist);
	}

}
