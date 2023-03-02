package thread_lab;

public class CubeNumThread extends Thread{
	
		int n;
		public  CubeNumThread(int n){
			this.n=n;
		}
		public void run(){
			System.out.println("Cube of the number"+this.n+"is"+Math.pow(this.n, 3));
	}
}


