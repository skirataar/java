package com.nani.gmail;

import java.util.Scanner;

public class HiddenClass implements gmailInterface {
	
	Scanner scn = new Scanner(System.in);
	String gmail = null;
	int password;
	int flagger = 0;
	
	public void enterGmailID()
	{
		System.out.println("Enter the GMAIL-ID");
		gmail = scn.next();
	
		for(int i = 0; i < gmail.length(); i++)
		{	
			
			if(gmail.charAt(i) == '@')
			{
				for(int j = i + 1, k = 0; j < gmail.length(); j++, k++)
				{	
					String checker = "gmail.com";
					if(gmail.charAt(j++) == checker.charAt(k++))
					{
						flagger = 1;
					}
					else
					{
						flagger = 0;
						break;
					}
				}
			}
			else
			{
				flagger = 0;
			}
		}
		
		if(flagger == 0)
		{
			System.out.println("GMAIL ID is not Valid ... \nRe-Enter the GMAIL-ID");
			
		}
			
		else
		{
			System.out.println("GMAIL ID is Valid .....\nWaiting for Verification");
		}
			
	}
	
	public void verifyGmailID()
	{
		System.out.println("GMAIL-ID Verified\n");
	}
	
	public void enterPassword()
	{	
		if(flagger == 0)
		{
			System.out.println("Please Re-Enter the GMAIL-ID: ");
			enterGmailID();
		}
		else
		{
			System.out.println("Enter the Password: ");
			password = scn.nextInt();
		}

	}
	
	public void verifyPassword()
	{
		System.out.println("Password Verified\nLogic Successful\n");
	}
	

}
