package M1_Basics_Program;

import java.sql.SQLOutput;
import java.util.Scanner;

public class P2_GreetMsg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = in.nextLine();
        System.out.println("Hare Krishna, "+name);
    }
}
