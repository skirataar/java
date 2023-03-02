package thread_lab;

public class SquareNumThread extends Thread {
	int n;
	public  SquareNumThread(int n) {
		this.n=n;
	}
	public void run(){
		System.out.println("Square of the number"+this.n+"is"+Math.pow(this.n, 2));
	}
}
