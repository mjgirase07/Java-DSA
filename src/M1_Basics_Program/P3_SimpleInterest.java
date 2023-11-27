package M1_Basics_Program;

import java.util.Scanner;

public class P3_SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Principle amount:");
        int p = in.nextInt();
        System.out.print("Enter Rate:");
        float r = in.nextFloat();
        System.out.print("Enter Time:");
        float t = in.nextFloat();
        float si = (p*r*t)/100;
        System.out.println("The simple interest is "+si);
    }
}
