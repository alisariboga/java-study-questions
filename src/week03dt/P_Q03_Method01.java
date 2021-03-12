package week03dt;

import java.util.Scanner;

public class P_Q03_Method01 {
    public static void main(String[] args) {
        /*
        Write a method named isEven that accepts an integer argument.
	 The method should return true if the argument is even, or false otherwise.
         */
        isEven();
    }

    public static boolean isEven() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scan.nextInt();
        if (num % 2 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        return true;
    }
}
