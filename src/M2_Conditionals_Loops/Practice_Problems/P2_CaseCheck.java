package M2_Conditionals_Loops.Practice_Problems;

import java.util.Scanner;
//Find a Lwer or Upper case of an alphabet
public class P2_CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a alphabet");
        char ch = in.next().trim().charAt(0);
        if (ch >='a' && ch<='z'){
            System.out.println(ch+" is a Lower Case");
        } else if (ch >='A' && ch<='Z') {
            System.out.println(ch+" is a Upper Case");
        }
    }
}
