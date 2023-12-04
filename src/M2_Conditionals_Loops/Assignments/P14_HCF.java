package M2_Conditionals_Loops.Assignments;

import java.util.Scanner;

public class P14_HCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1,num2,hcf=0;
        System.out.println("Enter the first num:");
        num1 = in.nextInt();
        System.out.println("Enter the second num:");
        num2 = in.nextInt();
        for (int i = 1; i < num1 || i < num2; i++) {
            if (num1%i==0 && num2%i==0){
                hcf = i;
            }
        }
        System.out.println("The hcf "+num1+" and "+num2+" is "+hcf);
    }
}
