package com.RNSIT.conv;
import java.util.Scanner;

public class currConv {
	private
	double cur;
	char src;
	char dest;
	
	public
	Scanner sc = new Scanner(System.in);
	void getData() {
		System.out.println("INR=I/YEN=Y/USD=U/EURO=E");
		System.out.println("Enter the source currency ");
		src=sc.next().charAt(0);
		
		if (src == 'I') {
			System.out.println("Enter the destination currency ");
			dest=sc.next().charAt(0);
		}
		System.out.println("Enter Amount to be converted: ");
		cur=sc.nextDouble();

	}
	void calc() {
		if(src=='I') {
			switch(dest) {
			case 'U': cur/= 82.78;
			break;
			
			case 'E': cur/= 87.82;
			break;
			
			case 'Y': cur/= 0.62;
			break;
			
			default: System.out.println("Enter valid option.");
	
			}
		}
		else {
			switch(src) {
			case 'U' : cur*=82.6;
			break;
			
			case 'E' : cur*=87.82;
			break;
			
			case 'Y' : cur*=0.62;
			break;
			
			default: System.out.println("Enter valid option.");
			}
		}
		
	}
	void display() {
		System.out.println(String.format("%.2f", cur));
	}
}