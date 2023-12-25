package M3_Functions.Assignments;

import java.util.Scanner;

public class P3_IsEligibleToVote {
    public static void main(String[] args) {
        //A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out
        // if he/she is eligible to vote.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = in.nextInt();
        if (isEligible(age)){
            System.out.println("Eligible to Vote");
        } else {
            System.out.println("You need to grow child");
        }
    }
    static boolean isEligible(int age){
        if (age>=18){
            return true;
        } else {
            return false;
        }
    }
}
