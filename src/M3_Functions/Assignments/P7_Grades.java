package M3_Functions.Assignments;

import java.util.Scanner;

public class P7_Grades {
    public static void main(String[] args) {
        //Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will
        // display grades according to the marks entered as below:

//        Marks        Grade
//        91-100         AA
//        81-90          AB
//        71-80          BB
//        61-70          BC
//        51-60          CD
//        41-50          DD
//        <=40          Fail

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your marks (0-100):");
        int marks = in.nextInt();
        printGrades(marks);
    }
    static void printGrades(int marks){
        if (marks > 90 && marks<=100){
            System.out.println("Grades:AA");
        }  else if (marks > 80 && marks<=90){
            System.out.println("Grades:AB");
        }   else if (marks > 70 && marks<=80){
            System.out.println("Grades:BB");
        }   else if (marks > 60 && marks<=70){
            System.out.println("Grades:BC");
        }   else if (marks > 50 && marks<=60){
            System.out.println("Grades:CD");
        }   else if (marks > 40 && marks<=50){
            System.out.println("Grades:DD");
        }   else if (marks<=40){
            System.out.println("Grades:Fail");
        }
    }
}
