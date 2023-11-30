package M2_Conditionals_Loops.Assignments;

import java.util.Scanner;

public class P1_ShapesVolArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float area,volume,radius,height,breadth,length;

        //1. Area Of Circle
       /* System.out.println("Enter the radius of circle:");
        radius = in.nextFloat();
        area = (float) Math.PI*radius*radius;
        System.out.println("Area of circle:"+area);*/

        //2.Area Of Triangle
        /* System.out.println("Enter height and breadth respectively:");
        height = in.nextFloat();
        breadth = in.nextFloat();
        System.out.println("Area of triangle:"+0.5*height*breadth);*/

        //3.Area Of Isosceles Triangle
        /* System.out.println("Enter side of triangle:");
        height = in.nextFloat();
        area = (float) (Math.sqrt(3)*0.25*height*height);
        System.out.println(area);*/

        //4.Volume Of Pyramid
        System.out.println("Enter length,breadth and height respectively:");
        length = in.nextFloat();
        breadth = in.nextFloat();
        height = in.nextFloat();
        volume = length*breadth*height;
        System.out.println("Volume of pyramid:"+ volume/3);
    }
}
