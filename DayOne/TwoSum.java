import java.util.*;


class TwoSum {
    //TwoSum Problem: https://leetcode.com/problems/two-sum/description/
    //Bruteforce approach
    static int[] solution(int[] arr, int target) {
        for (int i = 0; i < arr.length;i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && (arr[i]+arr[j] == target)) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
    
    //Optimal approach
    static int[] solutionOp(int[] arr, int target) {
        Map<Integer,Integer> valToIndex = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int comp = target-arr[i];
            if (valToIndex.containsKey(comp)) {
                return new int[] { i, valToIndex.get(comp) };
            }
            valToIndex.put(arr[i],i);
        } 
        return new int[]{};
    }
    
    //Main method to take input in according to the problem
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