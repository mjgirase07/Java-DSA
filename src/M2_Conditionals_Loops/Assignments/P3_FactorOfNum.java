package M2_Conditionals_Loops.Assignments;

import java.util.Scanner;

public class P3_FactorOfNum {
    public static void main(String[] args) {
        //Input a number and print all the factors of that number (use loops).
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = in.nextInt();
        for (int i = 1; i <=num; i++) {
            if (num%i==0){
                System.out.print(i+"\t");
            }
        }
    }
}
