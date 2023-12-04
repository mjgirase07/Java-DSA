package M2_Conditionals_Loops.Assignments;

import java.time.Month;
import java.util.Scanner;

public class P20_evenDays {
    public static void main(String[] args) {
        //Mahendra is allowed to go out with his friends only on the even days of a given month.
        // Write a program to count the number of days he can go out in the month of August.

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name of month");
        String monthName = in.next();
        Month monthDay = Month.valueOf(monthName.toUpperCase());
        int count=0;
        for (int i = 1; i < monthDay.length(true); i++) {
            if (i%2==0){
                count++;
            }
        }
        System.out.println("The number days Mahendra can go out with his imaginary friends are "+count);

        // In reality mahendra don't want to out😎.
        // Because in real reality mahendra don't have friends 😭 moye moye 🕺💃👯‍♂️
    }
}

