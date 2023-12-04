package M2_Conditionals_Loops.Assignments;

import java.sql.SQLOutput;
import java.util.Scanner;

public class P21_IntegersSum {
    public static void main(String[] args) {
        //Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive
        // odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter integers number (0 to terminate)");
        int num,nsum=0,PEsum=0,POsum=0;
        while (true)
        {
            num = in.nextInt();
            if (num<0){
                nsum += num;
            } else if (num>0){
                if (num%2==0){
                    PEsum += num;
                } else {
                    POsum += num;
                }
            } else if (num==0){
                break;
            } else {
                System.out.println("Enter number is not integer or it is a character");
            }
        }
        System.out.println("Sum of negative number:"+nsum);
        System.out.println("Sum of even number:"+PEsum);
        System.out.println("Sum of odd number:"+POsum);
    }
}
