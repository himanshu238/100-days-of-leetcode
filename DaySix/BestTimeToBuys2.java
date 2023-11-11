import java.util.*;

public class BestTimeToBuys2 {

    static int maxProfit(int[] arr) {
        int profit = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                profit += (arr[i + 1] - arr[i]);
            }
        }
        return profit;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        //Input
        System.out.print("Enter length: ");
        int len = in.nextInt();
        int[] arr = new int[len];
        System.out.print("Enter numbers: ");
        for (int i = 0; i < len; i++) {
            arr[i] = in.nextInt();
        }
        int profit = maxProfit(arr);
        System.out.println("Profit: " + profit);
    }
}
