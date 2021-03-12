package week02dt;

import java.util.Scanner;

public class P_Q01_ElseIf_MassIndex {
    public static void main(String[] args) {
        /*
     Ask user to their weight and height and type a program with calculates mass index
     HINT : Body Mass Index = Weight (kg) / Square of height (m)
     Then give a message to user as following:
     If BMI is less than 18.5 , print "you re weak"
     If BMI is between 18.5 and 25 ,print  "your weight is ideal"
     If BMI is between 25 and 30, print "you re fat"
     If BMI is more than or equal to 30, print "obese"

     EXAMPLE :

     INPUT: Weight : 71
            Height : 1,72

     OUTPUT : Your BMI is  : 23.99945916711736
     */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the your height(kg)");
        double height = scan.nextDouble();
        System.out.println("Please enter the your weight(m) ");
        double weight = scan.nextDouble();
        double bodyMassIndex = height/(weight*2);

        System.out.println("your Mass index is : " + bodyMassIndex);

        if (bodyMassIndex < 18.49) {
            System.out.println("you re weak");
        }
        if (bodyMassIndex >= 18.49 && bodyMassIndex <= 24.99) {
            System.out.println("your weight is ideal");
        }
        if (bodyMassIndex >= 24.99 && bodyMassIndex <= 29.99) {
            System.out.println("you re fat");
        }
        if (bodyMassIndex >= 29.99) {
            System.out.println("obese");
        }

    }
}
