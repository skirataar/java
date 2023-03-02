package thread;

public class Demo {
	public static void main(String[] args) {
		mythread t = new mythread();
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("Main thread"+i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
