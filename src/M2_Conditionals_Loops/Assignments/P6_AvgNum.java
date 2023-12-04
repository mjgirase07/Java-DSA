package M2_Conditionals_Loops.Assignments;

import java.util.Scanner;

public class P6_AvgNum {
    public static void main(String[] args) {
        //Calculate Average Of N Numbers
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers (0 to exit)");
        int num,sum=0,count=0;
        while (true){
            num = in.nextInt();
            sum += num;
            if (num==0){
                break;
            }
            count++;
        }
        System.out.println("Avg of all number:"+ (float)(sum/count));
    }
}
