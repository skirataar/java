package com.RNSIT.conv;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class timeConv {
	private
	long time;
	char src,dest;
	
	public
	Scanner sc = new Scanner(System.in);
	void getData() {
		System.out.println("Enter In All Caps H/M/S");
		System.out.println("Enter source ");
		src=sc.next().charAt(0);
		System.out.println("Enter destination ");
		dest=sc.next().charAt(0);
		System.out.println("Enter time: ");
		time=sc.nextLong();
		
	}
	void convert() {
		if(src=='H') {
			switch(dest) {
			case 'M': time=TimeUnit.HOURS.toMinutes(time);
			break;
			case 'S': time=TimeUnit.HOURS.toSeconds(time);
			break;
			default : System.out.println("Enter valid option");
			}
		}
		else if(src=='S')
			time=TimeUnit.SECONDS.toHours(time);
		else if(src=='M')
			time=TimeUnit.MINUTES.toHours(time);
		else 
			System.out.println("Enter valid option");
	}
	void display() {
		System.out.println(time);
	}
}
