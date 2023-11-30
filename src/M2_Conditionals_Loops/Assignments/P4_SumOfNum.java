package M2_Conditionals_Loops.Assignments;

import java.util.Scanner;

public class P4_SumOfNum {
    public static void main(String[] args) {
        //Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers (0 to exit)");
        int num,sum=0;
        while (true){
            num = in.nextInt();
            sum += num;
            if (num==0){
                break;
            }
        }
        System.out.println("Sum of all number:"+sum);
    }
}
