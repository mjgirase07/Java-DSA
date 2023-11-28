package M2_Conditionals_Loops.Practice_Problems;

import java.util.Scanner;

public class P4_countOccurrence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = in.nextInt();
        int count =0;
        while (num != 0){
            int rem = num%10;
            if(rem==7){
                count++;
            }
            num /=10;
        }
        System.out.println("The number 7 occurred "+count+" times");
    }
}
