package M2_Conditionals_Loops.Assignments;

import java.util.Scanner;

public class P7_DiscountOfProduct {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int actualPrice,perDiscount;
        float discountedPrice;
        String product;
        System.out.print("Enter Product name:");
        product = in.nextLine();
        System.out.print("Enter the price of "+product+":");
        actualPrice = in.nextInt();
        System.out.print("Enter the discount percentage:");
        perDiscount = in.nextInt();
        discountedPrice = (float) (actualPrice - actualPrice*perDiscount*0.01);
        System.out.println(product+" cost you "+discountedPrice);
    }
}
