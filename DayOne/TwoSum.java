import java.util.*;


class TwoSum {

    static int[] solution(int[] arr, int target) {
        int[] temp = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && (arr[i]+arr[j] == target)) {
                    temp[0] = i;
                    temp[1] = j;
                    return temp;
                }
            }
        }
        return temp;
        
    }

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the length of array: ");
        int length = in.nextInt();
        
        int[] arr = new int[length];
        
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Enter target: ");
        int target = in.nextInt();

        int[] sol = solution(arr, target);

        System.out.println("Solution: "+Arrays.toString(sol));

        in.close();
    }
}