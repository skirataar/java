package accountInterface;
import java.util.Scanner;

public class Demo {
	public static void main(String[] Args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		char ch;
		System.out.println("Enter the chosen bank: ");
		ch=sc.next().charAt(0);
//		if(ch=='h') {
//			account a = MyAcc.getAccount('h');
//			a.open_acc();
//			a.accdetails();
//		}
//		else if(ch=='i'){
//			account a = MyAcc.getAccount('i');
//			a.open_acc();
//			a.accdetails();
//		}
//		else {
//			System.out.println("Enter correct option!");
//		}
		account a = MyAcc.getAccount(ch);
		a.open_acc();
		a.accdetails();
	}

}
