import java.util.*;
public class Jump2 {
    
    static int jump(int[] arr) {
        int count = 0;
        int jump = 0;
        int end = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            end = Math.max(end, arr[i] + i);
            if (i == jump) {
                jump = end;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int len = in.nextInt();
        int[] arr = new int[len];
        System.out.print("Enter Numbers: ");
        for(int i=0;i<len;i++){
            arr[i] = in.nextInt();
        }
        int res = jump(arr);
        System.out.println("Result : "+res);
    }
}
