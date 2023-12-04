package M2_Conditionals_Loops.Assignments;

import java.util.Scanner;

public class P8_DistTwoPoint {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float x1,y1,x2,y2;
        System.out.println("Enter coordinates of first pt:");
        x1 = in.nextFloat();
        y1 = in.nextFloat();
        System.out.println("Enter coordinates of second pt:");
        x2 = in.nextFloat();
        y2 = in.nextFloat();
        float distance = (float)(Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2)));
        System.out.println("Distance between two points:"+distance);
    }
}
