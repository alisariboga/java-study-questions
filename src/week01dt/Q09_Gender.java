package week01dt;

import java.util.Scanner;

public class Q09_Gender {
    public static void main(String[] args) {
        /*
         Type a program that ask user their age and gender.
         If age is greater or equal than 18 and if gender is male, then print man ,
         if age is greater or equal than 18 and if gender is female then print woman
          If age is less than 18 and if gender is male then print boy ,
           If age is less than 18 and if gender is female then print girl on te console.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = scan.nextInt();
        System.out.println("Enter the f if you are female or m you are male");
        char gender = scan.next().toLowerCase().charAt(0);

        if (age >= 18 && gender == 'f' ) {
            System.out.println("female");
        }else if (age >= 18 && gender == 'm' ){
            System.out.println("male");
        }else if (age < 18 && gender == 'f' ) {
            System.out.println("girl");
        }else if (age < 18 && gender == 'm' ){
            System.out.println("boy");
        }else{
            System.out.println("You are not human :)");
        }


//        if (age >= 18) {
//            if (gender == 'M'){
//                System.out.println("Man");
//            }else{
//                System.out.println("Woman");
//            }
//        }else{
//            if (gender == 'M') {
//                System.out.println("Boy");
//            }else{
//                System.out.println("Girl");
//            }
//        }
        scan.close();
    }
}
