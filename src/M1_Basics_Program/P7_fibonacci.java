package M1_Basics_Program;

import java.util.Scanner;

public class P7_fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number up to you want fibonacci series:");
        int num = in.nextInt();
        int a = 0, b = 1,c;
        System.out.print(a+"\t"+b+"\t");
        for (int i=2;i<num;i++){
            c = a+b;
            a=b;
            b=c;
            System.out.print(c+"\t");
        }

    }
}
