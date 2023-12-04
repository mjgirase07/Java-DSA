package M2_Conditionals_Loops.Assignments;

import java.util.Scanner;

public class P9_ArmstrongNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = in.nextInt();
        int temp=num,digit,n=0,sum=0;

        while(temp!=0){
            temp /= 10;
            n++;
        }
        temp=num;
        while(temp!=0){
            digit = temp%10;
            sum += Math.pow(digit,n);
            temp /= 10;
        }
        if (num==sum){
            System.out.println("The number enter is Armstrong:)");
        } else {
            System.out.println("The number is not Armstrong:(");
        }

    }
}
