package M2_Conditionals_Loops.Assignments;

import java.util.Scanner;

public class P17_SumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a num:");
        int num = in.nextInt();
        int digit,sum=0;
        int temp = num;
        while (temp != 0){
            digit = temp % 10;
            sum += digit;
            temp /= 10;
        }
        System.out.println("The sum of digits of "+num+" is "+sum);
    }
}
