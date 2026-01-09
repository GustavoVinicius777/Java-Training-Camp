package seisprimeiros;

import java.util.Scanner;

public class aaEnhancedSwitches {
    static void main(String[] args){

        // enhanced switches = A replacement to many else if statements
        //                     (java14 feature)
        // this symbol [ -> ] is a arrow and a arrow operator tells to the programm, do something, do this.

        Scanner dias = new Scanner(System.in);

        System.out.println("Please type the day is today: ");
        String day = dias.nextLine().toLowerCase();

        /*
        // way number one, longer but needed sometimes in some cases.

        switch(day){
            case "monday" -> System.out.println("it´s a weekday");
            case "tuesday" -> System.out.println("it´s a weekday");
            case "wednesday" -> System.out.println("it´s a weekday");
            case "thursday" -> System.out.println("it´s a weekday");
            case "friday" -> System.out.println("it´s a weekday");
            case "saturday" -> System.out.println("it´s a weekend");
            case "sunday" -> System.out.println("it´s a weekend");
        */

        // case number two, shorter and the mostly used

            switch(day){
                case "monday", "tuesday", "wednesday", "thursday", "friday" ->
                        System.out.println("it´s a weekday");

                case "saturday", "sunday" ->
                        System.out.println("it´s a weekend");

            default -> {
                System.out.println("Sorry but " + day + " is not a valid day of the week.");

                dias.close();
            }
        }
    }
}
