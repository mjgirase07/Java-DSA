package M3_Functions.Assignments;

import java.util.Scanner;

public class P6_IsPrime {
    public static void main(String[] args) {
        //Define a method to find out if a number is prime or not.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = in.nextInt();
        if (Isprime(num)){
            System.out.println("The number enter by the user "+num+" is Prime.");
        } else {
            System.out.println("The number enter by the user "+num+" is not Prime.");
        }
    }
    static boolean Isprime(int num){
        boolean check = true;
        for (int i = 2; i <num; i++) {
            if (num%i==0){
                check = false;
                break;
            } else {
                check = true;
            }
        }
        return check;
    }
}
