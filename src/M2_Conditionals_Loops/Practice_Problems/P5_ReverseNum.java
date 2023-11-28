package M2_Conditionals_Loops.Practice_Problems;

import java.util.Scanner;

public class P5_ReverseNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = in.nextInt();
        int rem,rnum=0;
        while (num != 0){
           rem = num%10;
           num /= 10;

           rnum = rnum*10 + rem;
        }
        System.out.println(rnum);
    }
}
