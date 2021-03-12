package week01dt;

import java.util.Scanner;

public class Q5_GradeCalculation {
    public static void main(String[] args) {
        /*
         Ask user to enter mid-term grade, final grade, and project grade
         Calculate the general grade (mid-term : 30% , project : 20%, final : 50%)

          Example:
              INPUT: mid-term grade=78
                     final grade = 66
                     project grade = 90
              OUTPUT: "Your grade is : 81,6"

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the mid-term grade result");
        double midTermGrade = scan.nextDouble();
        System.out.println("Enter the final grade result");
        double finalTermGrade = scan.nextDouble();
        System.out.println("Enter the project grade result");
        double projectGrade = scan.nextDouble();

        double totalResult = (midTermGrade*30)/100 + (projectGrade*20)/100 + (finalTermGrade*50)/100;

        System.out.println(totalResult);

        scan.close();

    }
}
