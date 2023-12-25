package M3_Functions.Assignments;

import java.util.Scanner;

public class P4_SumFunction {
    public static void main(String[] args) {
        //Write a program to print the sum of two numbers entered by user by defining your own method.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first num");
        int num1 = in.nextInt();
        System.out.println("Enter second num");
        int num2 = in.nextInt();
        System.out.println(sum(num1,num2));
    }
    static int sum(int n1, int n2){
        return n1+n2;
    }
}
