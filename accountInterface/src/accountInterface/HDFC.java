package accountInterface;
import java.util.Scanner;

public class HDFC implements account 
{
	String name;
	int acc;
	double bal;
	@SuppressWarnings("resource")
	public void open_acc(){

		
		Scanner sc = new Scanner(System.in);
		System.out.println("\t\tWelcome to HDFC Bank");
		System.out.println("Enter your name: ");
		name=sc.nextLine();
		System.out.println("Enter Acc No.: ");
		acc=sc.nextInt();
		bal=(double)(Math.random()*(1000000-100000+1)+100000);
		
		
	}
	public void accdetails() {
		System.out.println("Name: "+name);
		System.out.println("Account No.: "+acc);
		System.out.println("Your Account Balance is "+bal);
		
	}

}
