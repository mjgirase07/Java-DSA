package M1_Basics_Program;

import java.util.Scanner;

public class P5_largestNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number:");
        int num1 = in.nextInt();
        System.out.print("Enter second number:");
        int num2 = in.nextInt();
        if(num1>num2){
            System.out.println(num1+" is the largest.");
        } else {
            System.out.println(num2+" is the largest.");
        }
    }
}
