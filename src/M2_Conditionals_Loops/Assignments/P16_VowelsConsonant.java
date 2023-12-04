package M2_Conditionals_Loops.Assignments;

import java.util.Scanner;

public class P16_VowelsConsonant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a alphabet:");
        char ch = in.next().charAt(0);
        if ( ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
            if (ch=='a' || ch == 'A' || ch=='e' || ch == 'E' || ch=='i' || ch == 'I' || ch=='o' || ch == 'O' || ch=='u' || ch == 'U'){
                System.out.println("Enter alphabet is a vowel");
            } else {
                System.out.println("Enter alphabet is a consonant");
            }
        } else {
            System.out.println("Enter character is not an alphabet");
        }

    }
}
