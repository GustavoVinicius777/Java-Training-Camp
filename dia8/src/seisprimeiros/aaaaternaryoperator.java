package seisprimeiros;

public class aaaaternaryoperator {
    static void main(String[] args){

        //what is a ternary operator? : a ternary operator is a question mark
        // = Return 1 of 2 values if a condition is true
        // variable = (condition) ? ifTrue return a value ifFalse return another value or error, depends on the programm you running;

        // you use a ? [question mark] in a ternary statement because you asking a question if the value is true or false.
        // the : [column] means "otherwise" like if the first is not true so print this. Example:
        // nota = 10; (nota >= 6) ? "ok" : [otherwise] "not ok";

        /*
        // Example using the if statement
        int score = 50;

        if(score >= 55){
            System.out.println("you passed");
        }
        else{
            System.out.println("you failed");
        }
        */

        /*
        int score = 70;

        String PassOrFail = (score >= 55) ? "You Passed" : "You Failed";

        System.out.println(PassOrFail);
        */

        /*
        int number = 4;

        String EvenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";

        System.out.println(EvenOrOdd);
        */

        /*
        int hours = 12;

        String timeofday = (hours < 12) ? "AM" : "PM";

        System.out.println(timeofday);
        */

        int income = 30000;

        double taxrate = (income >= 40000) ? 0.25 : 0.15;

        System.out.println(taxrate);
    }
}
