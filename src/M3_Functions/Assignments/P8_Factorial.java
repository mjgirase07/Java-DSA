package M3_Functions.Assignments;
import java.util.Scanner;
public class P8_Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = in.nextInt();
        factorial(num);

    }
    static void factorial(int num){
        int fact = 1;
        if (num == 1 || num == 0){
            System.out.println("Factorial of "+num+" is "+fact);
        } else {
            for (int i = 1; i <= num; i++) {
                fact *= i;
            }
            System.out.println("Factorial of "+num+" is "+fact);
        }

    }

}
