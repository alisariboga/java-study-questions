package week01dt;

import java.util.Scanner;

public class Q10_Overflow {
    public static void main(String[] args) {
        /*
         Write a Java program to compute and print sum of two given numbers (more than or equal to zero).
If given integers or the sum have more than 10 digits, print "overflow".
EXAMPLE:
   INPUT      :
Input two integers:
25
46
     OUTPUT :
Sum of the said two numbers:
71
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number 1");
        double num1 = scan.nextDouble();
        System.out.println("Please enter the number 2");
        double num2 = scan.nextDouble();

        double sum = num1+num2;

        System.out.println(sum);


    }
}
