package M2_Conditionals_Loops.Assignments;

import java.util.Scanner;

public class P11_ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str, rstr="";
        char ch;
        System.out.print("Enter a string:");
        str = in.nextLine();
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            rstr = ch+rstr;
        }
        System.out.println("Reverse string is:"+rstr);
    }
}
