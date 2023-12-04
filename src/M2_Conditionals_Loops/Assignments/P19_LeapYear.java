package M2_Conditionals_Loops.Assignments;

import java.util.Scanner;

public class P19_LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter year in number");
        int year = in.nextInt();
        if (year%4 == 0){
            if (year%100 == 0){
                if (year%400 == 0){
                    System.out.println("Leap year");
                } else {
                    System.out.println("Not leap year");
                }
            } else {
                System.out.println("leap year");
            }
        } else {
            System.out.println("Not leap year");
        }
    }
}
