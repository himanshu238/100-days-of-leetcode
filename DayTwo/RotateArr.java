import java.util.*;

public class RotateArr {

    //https://leetcode.com/problems/rotate-array/
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
    }

    static void rotate(int[] arr, int k) {
        //Taking mod to reduce the number of computation i.e if we rotate array of size 5 for five times then the it will be the same array e.g [1,2,3] rotating 3 times will give [1,2,4]
        k %= arr.length;
        // Doing complete reverse of array
        reverse(arr, 0, arr.length - 1);
        //Reversing first k numbers to get the first half in order
        reverse(arr, 0, k - 1);
        //Reversing second half in order
        reverse(arr, k, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String args[]) {
        //Taking input
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the length of array: ");
        int length = in.nextInt();

        int[] arr = new int[length];
        System.out.print("Enter Numbers: ");
        for (int i = 0; i < length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print("Enter number of rotations: ");
        int k = in.nextInt();

        //calling rotate function
        rotate(arr, k);

    }
}
