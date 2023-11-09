import java.util.Scanner;

public class Jumpgame {

    static boolean jumpPossible(int[] arr) {
        int reach = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i > reach) {
                return false;
            }
            reach = Math.max(reach, i + arr[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of Array: ");
        int length = in.nextInt();
        int[] arr = new int[length];
        System.out.print("Enter the Elements: ");
        for (int i = 0; i < length; i++) {
            arr[i] = in.nextInt();
        }

        boolean result = jumpPossible(arr);
        System.out.println("Reult: " + result);
    }
    
}
