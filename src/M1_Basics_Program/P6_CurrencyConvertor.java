package M1_Basics_Program;

import java.util.Scanner;

public class P6_CurrencyConvertor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter amount in rupees ");
        float rupees = in.nextFloat();
        System.out.println("Amount in dollar will be "+rupees*0.012);
    }
}
