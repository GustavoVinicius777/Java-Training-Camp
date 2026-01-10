package doseteatéodoze;

import java.util.Random;
import java.util.Scanner;

public class aaaaNumberGuessing {
    static void main(String[] args){

        // NUMBER GUESSING GAME

        Random ale = new Random();

        Scanner trys = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;

        int randomnumber = ale.nextInt(min, max + 1);

        System.out.println("Guessing Number Game");
        System.out.printf("Guess a number between %d-%d \n", min, max);

        do{
            System.out.println("Enter a Guess: ");
            guess = trys.nextInt();
            attempts++;

            if(guess < randomnumber){
                System.out.println("TOO LOW! Try again.");
            }
            else if(guess > randomnumber){
                System.out.println("TOO HIGH! Try again.");
            }
            else{
                System.out.println("CORRECT! The number was " + randomnumber);
                System.out.println("# of attempts: " + attempts);
            }
        }
        while(guess != randomnumber);

        trys.close();
    }
}