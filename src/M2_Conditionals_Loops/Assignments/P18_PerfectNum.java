package M2_Conditionals_Loops.Assignments;

import java.util.Scanner;

public class P18_PerfectNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num,pro,sum=0;
        System.out.println("Enter the number");
        num = in.nextInt();
        pro = num * 2;
        for (int i = 1; i <=num ; i++) {
            if (num%i==0){
                sum += i;
            }
        }
        //Method 1
        if (pro == sum){
            System.out.println("Enter number is perfect square");
        } else {
            System.out.println("Enter number is not perfect square");
        }

        //Method 2
//        if (sum-num == num){
//            System.out.println("Enter number is perfect square");
//        } else {
//            System.out.println("Enter number is not perfect square");
//        }
    }
}
