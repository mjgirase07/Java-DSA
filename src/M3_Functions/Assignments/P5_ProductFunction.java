package M3_Functions.Assignments;

import java.util.Scanner;

public class P5_ProductFunction {
    public static void main(String[] args) {
        //Define a method that returns the product of two numbers entered by user.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first num");
        int num1 = in.nextInt();
        System.out.println("Enter second num");
        int num2 = in.nextInt();
        System.out.println(product(num1,num2));
    }
    static int product(int n1, int n2){
        return n1*n2;
    }
}
