package M2_Conditionals_Loops.Assignments;

import java.util.Scanner;

public class P13_FutureValue {
    public static void main(String[] args) {
        //Future Value (FV) = PV × (1 + r) ^ n
        Scanner in = new Scanner(System.in);
        System.out.println("Enter PV:");
        int pv = in.nextInt();
        System.out.println("Enter rate");
        int perRate = in.nextInt();
        System.out.println("Enter compounding period");
        int n = in.nextInt();
        float fv = (float) (pv*Math.pow(1+perRate*0.01,n));
        System.out.println("The Future Value is "+fv);
    }
}
