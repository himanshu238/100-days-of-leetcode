import java.util.*;

class RemoveElement {
    
    static int removeElement(int[] arr, int val) {
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != val) {
                arr[i] = arr[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the length of array");
        int len = in.nextInt();
        System.out.print("Enter the contents of Array: ");
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print("Enter the target: ");
        int target = in.nextInt();
        int res = removeElement(arr, target);
        System.out.println("Result: "+res);
    }
}