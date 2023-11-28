package M2_Conditionals_Loops.Practice_Problems;

import java.util.Scanner;
//Q. Find the fibonacci of nth number
public class P3_Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = in.nextInt();
        int n0=0,n1=1,next;
        System.out.print(n0+"\t"+n1+"\t");
//        for (int i = 1; i < n; i++) {
//            next = n0+n1;
//            System.out.print(next+"\t");
//            n0=n1;
//            n1=next;
//        }

        //Method 2
        int i=2;
        while(i<=n){
            int temp = n1;
            n1 = n1+n0;
            n0 = temp;
            System.out.print(n1+"\t");
            i++;
        }
    }
}
