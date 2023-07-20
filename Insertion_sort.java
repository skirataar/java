package abc;
import java.util.*;
public class Insertion_sort {
	public void insertion(int a[],int n) {
		int temp;
		for(int i=0;i<n-1;i++) {
			temp=a[i+1];
		int j=i;
		while(j>=0 && a[j]>temp) {
			a[j+1]=a[j];
			j--;
		}
		a[j+1]=temp;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array ");
		int n=sc.nextInt();
		int a[]=new int[n];
		boolean flag=true;
		int ch;
		Random r=new Random();
		Insertion_sort ob =new Insertion_sort();
		while(flag) {
			System.out.print("1.Best case \n2. Average case \n3. Worst case\n");
			ch=sc.nextInt();
			switch(ch) {
			case 1: for(int i=0;i<n;i++)
				    a[i]=i+1;
			         break;
			case 2: for(int i=0;i<n;i++)
				     a[i]=i+1;
			         break;
			case 3: for(int i=0;i<n;i++)
				    a[i]=n-1;
			        break;
			}
			if(flag) {
				System.out.print("Unsorted Array:");
				for(int i=0;i<n;i++)
					System.out.println(a[i]+" ");
				System.out.println("\n");
				long start,stop;
				start=System.nanoTime();
				ob.insertion(a,n);
				stop=System.nanoTime();
				System.out.println("Sorted Array:");
				for(int i=0;i<n;i++)
					System.out.println("\n Time Taken:"+(stop-start));
			}
		}
	}
}