package Greedy;
import java.util.*;
public class Coin_change {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of Denominations");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the Denominations:- ");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("Enter the amount");
		int x=sc.nextInt();
		int y=x;
		int totalcoins=0;
		long start,stop;
		//approach 1.
		start=System.nanoTime();
		for(int i=n-1;i>=0 && x!=0;i--) {
			if(a[i]<=x) {
				totalcoins+=x/a[i];
				System.out.print(a[i]+" x "+x/a[i]+" || ");
				x=x%a[i];
			}
		}
		stop=System.nanoTime();
		System.out.println("\nTotal coins:- "+totalcoins+"\nTime taken approach 1:- "+(stop-start));
		//Approach 2.
		int total2=0;
		start=System.nanoTime();
		while(y!=0) {
			for(int i=n-1;i>=0;i--) {
				if(a[i]<=y) {
					total2+=1;
					System.out.print(a[i]+" ");
					y=y-a[i];
					break;
				}
			}
		}
		stop=System.nanoTime();
		System.out.println("\nTotal coins:- "+total2+"\nTime taken approach 2:- "+(stop-start));
	}

}
