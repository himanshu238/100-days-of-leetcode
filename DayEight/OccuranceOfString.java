import java.util.*;

public class OccuranceOfString {

    static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String str = in.nextLine();
        System.out.println("Enter the string to be found: ");
        String needle = in.nextLine();
        int ans = strStr(str, needle);
        System.out.println("Result: "+ans);

    }

}