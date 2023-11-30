package M2_Conditionals_Loops.Assignments;

import java.util.Scanner;

public class P5_LargestNum {
    public static void main(String[] args) {
        //Take integer inputs till the user enters 0 and print the largest number from all.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers (0 to exit)");
        int num,max=0;
        while (true){
            num = in.nextInt();
            if (num == 0){
                break;
            }
            else if (max<num){
                max=num;
            }
        }
        System.out.println("The largest number is:"+max);
    }
}
