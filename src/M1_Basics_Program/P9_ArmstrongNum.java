package M1_Basics_Program;

import java.util.Scanner;
import java.math.*;
import java.io.*;

public class P9_ArmstrongNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = in.nextInt();
        System.out.println("Enter the second number:");
        int num2 = in.nextInt();
        for(int i=num1; i<num2; i++){

            //count number of digits
            int n=0,x=i;
            while (x != 0){
                x /= 10;
                ++n;
            }

            //compute the nth power of number
            x=i;
            int pow_num=0;
            while (x!=0){
                int digit = x % 10;
                pow_num += Math.pow(digit,n);
                x /= 10;
            }

            if(pow_num==i){
                System.out.print(i+" ");
            }
        }
    }
}
