package M2_Conditionals_Loops.Practice_Problems;

import java.util.Scanner;

//Q. Find largest of three number.
public class P1_LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max = a;

        //Method - 1
        /*if (b>max){
            if (b>c){
                System.out.println(b+" is the largest.");
            } else{
                System.out.println(c+" is the largest");
            }
        } else if (c>max) {
            System.out.println(c+" is the largest");
        } else {
            System.out.println(max+" is the largest");
        }*/

        //Method -2
//        if (b > max){
//            max = b;
//        }
//        if (c > max) {
//            max=c;
//        }
//        System.out.println(max+" is the largest");

        //Method -3
        max = Math.max(c,Math.max(a,b));
        System.out.println(max+" is the largest");
    }
}
