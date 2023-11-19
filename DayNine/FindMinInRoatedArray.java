import java.util.*;

public class FindMinInRoatedArray {
    
    static int findMin(int[] arr) {
        int start = 0, end = arr.length-1; 
        while(start<end){
            int mid = start +(end-start)/2; 
                if(arr[mid]<arr[end]){
                    end=mid;
                }else{
                    start = mid+1;
                }
        }
        return arr[start];               
    }

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int len = in.nextInt();
        System.out.print("Enter the contents of array: ");
        int[] arr = new int[len];
        for(int i =0; i<len;i++){
            arr[i] = in.nextInt();
        }
        int ans = findMin(arr);
        System.out.println("Result: "+ans);
    }
}
