package M2_Conditionals_Loops.Assignments;

import java.util.Scanner;

public class P12_PalindromeNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num,rnum=0,digit;
        System.out.println("Enter a number:");
        num = in.nextInt();
        int temp = num;
        while (temp != 0){
            digit = temp%10;
            rnum = rnum*10 + digit;
            temp /= 10;
        }
        if (rnum==num){
            System.out.println("The number is palindrome");
        } else {
            System.out.println("The number in not plaindrome.");
        }
    }
}
