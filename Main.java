package greedy_knapsack_cs025;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int caseNumber;

        System.out.println("Select the case number:");
        System.out.println("1. Best case scenario");
        System.out.println("2. Average case scenario");
        System.out.println("3. Worst case scenario");

        caseNumber = scanner.nextInt();

        greedyKnap.ItemValue[] arr = {new greedyKnap.ItemValue(60, 10), new greedyKnap.ItemValue(100, 20), new greedyKnap.ItemValue(120, 30)};
        int capacity = 50;

        double maxValue;

        switch (caseNumber) {
            case 1:
                // Best case scenario: Items are already sorted in descending order of profit/weight ratio
                // No need to sort, as the items are already sorted in descending order in the arr array
            	long start = System.nanoTime();
                maxValue = greedyKnap.getMaxValue(arr, capacity);
                long stop = System.nanoTime();
                System.out.println(stop-start);
                break;

            case 2:
                // Average case scenario: Items are in random order
                // No need to sort, as the items will be sorted in the getMaxValue function
            	start = System.nanoTime();
                maxValue = greedyKnap.getMaxValue(arr, capacity);
                stop = System.nanoTime();
                System.out.println(stop-start);
                break;

            case 3:
                // Worst case scenario: Items are already sorted in ascending order of profit/weight ratio
                Arrays.sort(arr, (item1, item2) -> {
                    double cpr1 = (double) item1.profit / (double) item1.weight;
                    double cpr2 = (double) item2.profit / (double) item2.weight;
                    if (cpr1 > cpr2)
                        return 1;
                    else
                        return -1;
                });
                start = System.nanoTime();
                maxValue = greedyKnap.getMaxValue(arr, capacity);
                stop = System.nanoTime();
                System.out.println(stop-start);
                break;

            default:
                System.out.println("Invalid case number!");
                return;
        }

        System.out.println("Maximum value in the knapsack: " + maxValue);
    }
}
