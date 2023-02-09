package com.array.in;
import java.util.*;
public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Alist obj = new Alist();
		int op;
		ArrayList<String> list = new ArrayList<String>();
		while(true)
		{
			System.out.println("Enter the option");
			System.out.println("1: append\n2: insert\n3: search\n4: show the elements which of specific letter at starting\n");
			op= sc.nextInt();
			switch(op)
			{
				case 1:
					obj.append(list);
					break;
				case 2:
					obj.insert(list);
					break;
				case 3:
					obj.search(list);
					break;
				case 4:
					obj.find(list);
					break;
				default:
					System.out.println("Displaying the elements of ArrayList");
					for(String s : list)
						System.out.println(s);
					sc.close();
					System.exit(0);
			}
		}

	}

}
