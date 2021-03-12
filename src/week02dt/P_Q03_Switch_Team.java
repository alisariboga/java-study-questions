package week02dt;

import java.util.Scanner;

public class P_Q03_Switch_Team {
    public static void main(String[] args) {
        // Question 1: Type the codes which asks the user to put the
        //letters for the favorite football club in Turkey. It prints "Galatasaray" for gs, it prints "Trabzonspor"for ts, it prints "Besiktas"
        //for bjk and it prints "Fenerbahce" for fb. Please use switch statement in your codes.

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your favorite football team in Turkey");
        String team = scan.nextLine().toLowerCase();

//        if (team.equals("BESIKTAS")) {
//            System.out.println("****BJK****");
//        }else if (team.equals("fenerbahce")){
//            System.out.println("FB");
//        }else if (team.equals("galatasaray")) {
//            System.out.println("gs");
//        }else if (team.equals("trabzon")){
//            System.out.println("ts");
//        }else{
//            System.out.println("please choose one team :)");
//        }

        switch (team) {
            case "bjk" :
                System.out.println("BESIKTAS");
                break;
            case "fb" :
                System.out.println("fenerbahce");
                break;
            case "gs" :
                System.out.println("galatasaray");
                break;
            case "ts" :
                System.out.println("trabzon spor");
                break;
            default:
                System.out.println("Please enter a valid letters");
        }


    }
}
