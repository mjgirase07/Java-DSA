package M1_Basics_Program;

import java.util.Scanner;

public class P4_Addition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number:");
        int num1 = in.nextInt();
        System.out.print("Enter Second number:");
        int num2 = in.nextInt();
        System.out.print("Enter a operator:");
        char op = in.next().charAt(0);
        if(op=='+'){
            System.out.println("Addition of two number is "+(num1+num2));
        } else if (op=='-') {
            System.out.println("Subtraction of two number is "+(num1-num2));
        } else if (op=='*') {
            System.out.println("Multiplication of two number is "+(num1*num2));
        } else{
            float num3 = num1/num2;
            System.out.println("Division of two number is "+num3);
        }

    }
}
