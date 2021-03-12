package week02dt;

import java.util.Scanner;

public class P_Q08_FirstThreeLetters {
    public static void main(String[] args) {
        // Type the codes which asks the user to enter the name.
        //It prints the first three characters of the name and puts * for the rest of the characters.

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = scan.nextLine().trim();

        System.out.println("First three letter is : " + name.substring(0,3)
                + name.substring(3,name.length()-1).replaceAll("\\D","*"));


    }
}
