import java.util.Scanner;

public class LastLength {

    // https://leetcode.com/problems/length-of-last-word/

    //Easyiest solution
    static int lengthOflastWord(String s) {
        //First we split the string on basis of " "(blank spaces) and store in list
        String[] sList = s.split(" ");
        // We pick out the last word and find the length
        return sList[sList.length - 1].length();
    }

    //optimal approch
    public int newLOLW(String s) {
        String str = s.trim();
        int count = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != ' ') {
                count += 1;
            } else {
                break;
            }
        }
        return count;
    }

    public static void main(String args[]){
        //To take input 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = sc.nextLine();

        int length = lengthOflastWord(s);

        System.out.println("Length: " + length);
    }
}
