package M2_Conditionals_Loops.Assignments;

import java.util.Scanner;

public class P15_LCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1,num2,hcf=0,lcm;
        System.out.println("Enter first number");
        num1 = in.nextInt();
        System.out.println("Enter second number");
        num2 = in.nextInt();

        for (int i = 1; i < num1 || i < num2; i++) {
            if (num1%i==0 && num2%i==0){
                hcf=i;
            }
        }
        lcm = num1*num2/hcf;
        System.out.println("The LCM is "+lcm);
    }
}
