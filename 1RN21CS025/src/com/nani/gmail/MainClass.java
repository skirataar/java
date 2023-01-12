package com.nani.gmail;

public class MainClass {

	public static void main(String[] args) {
		
		gmailInterface object1 = HelperClass.getDetails();
		
		object1.enterGmailID();
		object1.verifyGmailID();
		object1.enterPassword();
		object1.verifyPassword();

	}

}
