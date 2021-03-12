package week02dt;

import java.util.Scanner;

public class P_Q05_String_Contain {
    public static void main(String[] args) {
            /*
         Ask user to enter a letter.
         If user enters a letter that in first four letters,
         Your program will print "(This letter) is in the first four letters"
         It will also print if this letter is vowel or consonant
         Use switch.

         Example :
         INPUT: A
         OUTPUT: "A is in first letters"
                 "A is vowel"
          */

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your kids name ?");
        String name = scan.nextLine().toLowerCase();

        if (name.contains("a") && name.contains("z")) {
            System.out.println();
        }
    }
}
