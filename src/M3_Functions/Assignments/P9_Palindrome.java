package M3_Functions.Assignments;
import java.util.Scanner;
public class P9_Palindrome  {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a num");
        int num = in.nextInt();
        if (isPalindrome(num)){
            System.out.println("Enter number is palindrome");
        } else {
            System.out.println("Enter number is not palindrome");
        }
    }
    static boolean isPalindrome(int num){
        int digit,rnum=0;
        int temp = num;
        while (num!=0){
            digit = num%10;
            rnum = rnum*10 + digit;
            num /= 10;
        }
        if (temp==rnum){
            return true;
        } else {
            return false;
        }
    }
}
