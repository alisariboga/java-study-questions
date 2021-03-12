package week05dt;

import java.util.Random;
import java.util.Scanner;

public class Q05_GuessMyNumberGame {
    public static void main(String[] args) {
        /*
        Write a program that generates a random number and asks the user to guess
        what the number is. If the user's guess is higher than the random number,
        the program should display "Too high, try again." If the user's guess is
        lower than the random number, the program should display "Too low, try again."
        The program should use a loop that repeats until the user correctly guesses the random number.
         */
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int r = random.nextInt(101);

        for (; ; ) {
            System.out.println("Enter the number please from 1 to 100");
            int number = scan.nextInt();
            if (number > r) {
                System.out.println("Your number is big");

            } else if (number < r) {
                System.out.println("Your number is small");

            } else if (number == r) {
                System.out.println("Well done!");
                break;
            } else {
                System.out.println("Please enter the valid number");
            }


        }
        scan.close();

//          Teachers Answers
//        public static void main (String[]args){
//            Scanner scan = new Scanner(System.in);
//            Random random = new Random();
//            System.out.println("======Guess My Number Game======");
//            int randomNumber = random.nextInt(101);
//            int guess;
//            int counter = 0;
//            do {
//                System.out.println("Enter a guess between 0 and 100");
//                guess = scan.nextInt();
//                counter++;
//                if (guess > randomNumber) {
//                    System.out.println("Too high, try again");
//                } else if (guess < randomNumber) {
//                    System.out.println("Too low, try again");
//                } else {
//                    System.out.println("Correct! You got it in " + counter + " guesses");
//                }
//
//            } while (guess != randomNumber);


        }
    }
