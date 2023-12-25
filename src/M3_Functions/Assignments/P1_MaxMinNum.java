package M3_Functions.Assignments;

public class P1_MaxMinNum {
    public static void main(String[] args) {
        //Define two methods to print the maximum and the minimum number respectively
        // among three numbers entered by the user.
        System.out.println("Max:"+max(1,2,3));
        System.out.println("Min:"+min(1,2,3));
    }
    static int max(int a,int b, int c){
        if (a>b){
            if (a>c){
                return a;
            } else {
                return c;
            }
        } else if (b>c){
            return b;
        } else {
            return c;
        }
    }

    static int min(int a,int b, int c){
        if (a<b){
            if (a<c){
                return a;
            } else {
                return c;
            }
        } else if (b<c){
            return b;
        } else {
            return c;
        }
    }
}
