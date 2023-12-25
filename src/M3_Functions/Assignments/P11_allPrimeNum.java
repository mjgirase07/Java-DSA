package M3_Functions.Assignments;

import java.util.Scanner;

public class P11_allPrimeNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two num:");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        printPrime(num1,num2);
    }
    static void printPrime(int num1, int num2){
        for (int i = num1; i <= num2; i++) {
            if (isPrime(i)){
                System.out.println(i+" ");
            }
        }
    }
    static boolean isPrime(int num){
        boolean check = true;
        for (int i = 2; i < num ; i++) {
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
