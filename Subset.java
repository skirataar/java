import java.util.Scanner;

public class Subset {
    static int set[] = new int[10];
    static int solvector[] = new int[10];
    static int target;
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of items: ");
        int no_ele = sc.nextInt();
        System.out.println("Enter the numbers in ascending order");
        for (int i = 0; i < no_ele; i++)
            set[i] = sc.nextInt();
        System.out.println("Enter the target sum");
        target = sc.nextInt();
        int tot_sum = 0;
        for (int i = 0; i < no_ele; i++) {
            tot_sum = tot_sum + set[i];
        }

        if (target > tot_sum) {
            System.out.println("Solution doesnt Exist");
            System.exit(0);
        }
        System.out.println("The solutions are");
        Subset(0, 0, tot_sum);
        sc.close();
    }

    public static void Subset(int sumsofar, int index, int remsum) {
        solvector[index] = 1;
        if (sumsofar + set[index] == target) {
            System.out.println("Solution No: = " + (++count));
            for (int i = 0; i <= index; i++) {
                if (solvector[i] == 1)
                    System.out.println(" " + set[i]);
            }
        } else if (sumsofar + set[index] + set[index + 1] <= target) {
            Subset(sumsofar + set[index], index + 1, remsum - set[index]);
        }
        if ((sumsofar + remsum - set[index] >= target) && (sumsofar + set[index + 1] <= target)) {
            solvector[index] = 0;
            Subset(sumsofar, index + 1, remsum - set[index]);
        }
    }
}