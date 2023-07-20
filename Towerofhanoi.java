package abc;

public class Towerofhanoi {
	public static void towerofhanoi(int n,char from_rod,char to_rod,char aux_rod) {
		if(n==1)
		{
			System.out.println("Move disk 1 from rod "+from_rod+" to rod "+to_rod);
			return;
		}
		towerofhanoi(n-1,from_rod,aux_rod,to_rod);
		System.out.println("Move disk "+n+" from rod "+from_rod+" to_rod "+to_rod);
		towerofhanoi(n-1,aux_rod,to_rod,from_rod);
	}
	public static void main(String[] args) {
		int n=3;
		long start = System.nanoTime();
		towerofhanoi(n,'A' ,'C','B');
        long stop = System.nanoTime();
        System.out.println(stop-start);
	}
}
			
				
	
