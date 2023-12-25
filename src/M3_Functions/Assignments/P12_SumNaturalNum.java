package M3_Functions.Assignments;

import java.util.Scanner;

public class P12_SumNaturalNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a natural number");
        int num = in.nextInt();
        printSum(num);
    }
    static void printSum(int num){
        int sum = 0;
        for (int i = 1; i <=num ; i++) {
            sum += i;
        }
        System.out.println("The sum of n natural number till "+num+" is "+sum);
    }
}
