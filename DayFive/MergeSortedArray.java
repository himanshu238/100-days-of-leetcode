import java.util.*;

public class MergeSortedArray {

    //link: https://leetcode.com/problems/merge-sorted-array

    static void solution(int[] arr1, int m, int[] arr2, int n) {
        int end = arr1.length - 1;
        while (end >= 0) {
            if (m > 0 && n > 0) {
                if (arr1[m - 1] > arr2[n - 1]) {
                    arr1[end] = arr1[m - 1];
                    m--;
                } else {
                    arr1[end] = arr2[n - 1];
                    n--;
                }
            } else if (n > 0) {
                arr1[end] = arr2[n - 1];
                n--;
            }
            end--;
        }
        System.out.print(Arrays.toString(arr1));
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of array 1: ");
        int length1 = in.nextInt();
        int[] arr1 = new int[length1];
        System.out.print("Enter the Numbers in array 1: ");
        for (int i = 0; i < length1; i++) {
            arr1[i] = in.nextInt();
        }
        System.out.print("Enter M: ");
        int m = in.nextInt();
        System.out.print("Enter length of array 2: ");
        int length2 = in.nextInt();
        int[] arr2 = new int[length1];
        System.out.print("Enter the Numbers in array 2: ");
        for (int i = 0; i < length2; i++) {
            arr2[i] = in.nextInt();
        }
        System.out.print("Enter N: ");
        int n = in.nextInt();

        solution(arr1, m, arr2, n);
    }
}
