package week02dt;

import java.util.Scanner;

public class P_Q02_ElseIf_Overflow {
    public static void main(String[] args) {
        /*
         Write a Java program to compute and print sum of two given numbers (more than or equal to zero).
    If  sum have more than 10 digits, print "overflow".
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
        System.out.println("Please enter two numbers");
        double d1 = scan.nextDouble();
        double d2 = scan.nextDouble();
        double sum = d1+d2;

        if (d1<0 || d2<0) {
            System.out.println("numbers should be greater than zero");
        }
        else if (sum >= 100000000000d) {
            System.out.println("Overflow");
        }else{
            System.out.println("The sum of number is : " + sum);
        }

        /* Mrs Sayli Solve
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two numbers");
        double d1 = scan.nextDouble();
        double d2 = scan.nextDouble();
        double sum = d1+d2;

        if(d1<0 || d2<0) {
            System.out.println("Numbers should be greater than 0");
        }else if(sum >= 10000000000d) {
            System.out.println("Overflow");
        }else {
            System.out.println("The sum of two numbers is : " + sum);
        }

         */
    }
}
