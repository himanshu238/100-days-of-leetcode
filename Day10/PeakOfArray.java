import java.util.*;

//https://leetcode.com/problems/find-peak-element
public class PeakOfArray {
    static int findPeakElement(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter length of array: ");
        int len = in.nextInt();

        System.out.print("Enter the array: ");
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = in.nextInt();
        }
        int res = findPeakElement(arr);
        System.out.println("Res: "+res);
    }
}
