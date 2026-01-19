package LastPart;

import java.util.Scanner;

public class AaaAaaEnums {

    static Scanner scanner = new Scanner(System.in);

    static void main(String[] args){

        // Enums = (Enumerations) A special kind of class that
        //         represents a fixed set of constants.
        //         They improve code readability and are easy to maintain.
        //         More efficient with switches when comparing Strings.

        System.out.println("Enter a day of the week: ");
        String response = scanner.nextLine().toUpperCase();

        try {
            Day dia = Day.valueOf(response);

            switch (dia) {
                case Day.MONDAY, Day.TUESDAY, Day.WEDNESDAY,
                     Day.THURSDAY, Day.FRIDAY -> System.out.println("It´s a weekday");

                case Day.SATURDAY, Day.SUNDAY -> System.out.println("It´s a weekend");
            }
        }
        catch(IllegalArgumentException e){
            System.out.println("Please Enter a valid day of the week!");
        }

        scanner.close();
    }
}
