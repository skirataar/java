import java.util.Scanner;

public class Quad {
	private
		double a,b,c;
	public
		Scanner input = new Scanner(System.in);
		void getData() {
			System.out.println("enter the value of a");
		    a= input.nextDouble();
		    System.out.println("enter the value of b");
		    b= input.nextDouble();
		    System.out.println("enter the value of c");
		    c=input.nextDouble();
		
		}
		
		void calc() {
			double r1,r2,imag,real;
			double disc=b*b-4*a*c;
			if(a==0) {
				System.out.println("Not A Quad Equation");
			}
			else if(disc==0) {
				r1=-b/(2*a);
				System.out.println("the root is "+String.format("%.2f", r1));
			}
			else if(disc>0) {
				r1=(-b+Math.sqrt(disc))/(2*a);
				r2=(-b+Math.sqrt(disc))/(2*a);
				System.out.println("the roots are\n"+String.format("%.2f", r1)+"\n"+String.format("%.2f", r2));
			}
			else {
				real=(-b)/(2*a);
				imag=(Math.sqrt(Math.abs(disc)))/(2*a);
				System.out.println("the roots are "+String.format("%.2f", real)+" + "+String.format("%.2f", imag)+"i");
				System.out.println("the roots are "+String.format("%.2f", real)+" - "+String.format("%.2f", imag)+"i");
				
			}
		}
		

}
