package M1_Basics_Program;

import java.util.Scanner;

public class P8_Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = in.next();
        String rstr = "";
        char ch;
        for (int i=0; i<str.length(); i++){
            ch = str.charAt(i);
            rstr = ch+rstr;
        }
        if (str.equals(rstr)){
            System.out.println("Given string is palindrome");
        } else {
            System.out.println("Given string is not palindrome");
        }
    }
}
