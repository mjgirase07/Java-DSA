package M3_Functions.Assignments;
import java.util.Scanner;
public class P10_PythagoreanTriplet {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a three digit number:");
        int num = in.nextInt();
        isTriplet(num);
    }
    static void isTriplet(int num){
        int temp=num,fsdigit,tdigit,sum=0;
        tdigit = temp%10;
        tdigit =(int) Math.pow(tdigit,2);
        temp /= 10;
        while (temp!=0){
            fsdigit = temp%10;
            sum += Math.pow(fsdigit,2);
            temp/=10;
        }
        if (sum==tdigit){
            System.out.println("Yes it is triplet and sum:"+sum+" and 3rd digit square:"+tdigit);
        } else {
            System.out.println("No it is triplet and sum:"+sum+" and 3rd digit square:"+tdigit);
        }
    }
}
