package M2_Conditionals_Loops.Assignments;

import java.util.Scanner;

public class P2_SubtractPRoSum {
    public static void main(String[] args) {
        //https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
       /* Given an integer number n, return the difference between the product of its digits and the sum of its digits.
        Example 1:

        Input: n = 234
        Output: 15
        Explanation:
        Product of digits = 2 * 3 * 4 = 24
        Sum of digits = 2 + 3 + 4 = 9
        Result = 24 - 9 = 15*/

        Scanner in = new Scanner(System.in);
        int product=1,sum=0,rem,n;
        System.out.println("Enter the number");
        n = in.nextInt();
        while(n!=0){
            rem = n%10;
            product *= rem;
            sum += rem;
            n /= 10;
        }
        System.out.println(product-sum);
    }
}
