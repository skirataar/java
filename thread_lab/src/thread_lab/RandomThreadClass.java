package thread_lab;
import java.util.*;

public class RandomThreadClass extends Thread {
	public void run() {
		Random rand;
		int i=0,m;
		do {
			rand = new Random();
			m = rand.nextInt();
			System.out.println(m+" ");
			i++;
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}while(i<10);
		
	}
}
