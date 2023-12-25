package M3_Functions.Assignments;

public class P2_EvenOdd {
    public static void main(String[] args) {
        //Define a program to find out whether a given number is even or odd.
        System.out.println(checkEvenOdd(12));
    }
    static String checkEvenOdd(int num){
        if (num%2==0){
            return "Even";
        } else {
            return "Odd";
        }
    }


}
