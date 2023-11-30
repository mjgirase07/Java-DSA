package M2_Conditionals_Loops.Practice_Problems;

import java.util.Scanner;
public class P6_Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        while (true){
            System.out.print("Enter a operator:");
            char op = in.next().trim().charAt(0);
            if (op=='+' || op=='-' || op=='*' || op=='/' || op=='%'){
                System.out.print("Enter two number:");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                if (op=='+'){
                    ans = num1+num2;
                }
                if (op=='-'){
                    ans = num1-num2;
                }
                if (op=='*'){
                    ans = num1*num2;
                }
                if (op=='/'){
                    if (num2 != 0){
                        ans = num1/num2;
                    } else {
                        System.out.println("num2 cannot be 0");
                    }

                }
                if (op=='%'){
                    ans = num1%num2;
                }
                System.out.println(ans);
            } else if (op=='x' || op=='X') {
                break;
            }
            else {
                System.out.println("Inappropriate operator.");
            }
        }
        System.out.println("Thank you!!!");
    }
}
