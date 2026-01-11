package dezenoveatevintecinco;

import java.util.Random;
import java.util.Scanner;

public class aRockPaperScissors {

    static Scanner teste = new Scanner(System.in);
    static Random ale = new Random();

    static void main(String[] args){

        // rock paper scissor game

        String[] choices = {"rock", "raper", "scissors"};
        String playerchoice;
        String computerchoice;
        String playagain = "yes";


        do{
            System.out.println("Enter your move (rock, paper, scissors)");
            playerchoice = teste.nextLine().toLowerCase();

            if(!playerchoice.equals("rock") && !playerchoice.equals("paper") && !playerchoice.equals("scissors")){
                System.out.println("Invalid choice");
                continue; }

            computerchoice = choices[ale.nextInt(3)];
            System.out.println("computer choice: " + computerchoice);

            if(playerchoice.equals(computerchoice)){
                System.out.println("It´s a tie.");
            }
            else if((playerchoice.equals("rock") && computerchoice.equals("scissors")) ||
                    (playerchoice.equals("scissors") && computerchoice.equals("paper")) ||
                    (playerchoice.equals("paper") && computerchoice.equals("rock"))) {
                System.out.println("You win.");
            }
            else{
                System.out.println("You lose.");
            }

            System.out.println("You want to play again? (yes/no): ");
            playagain = teste.nextLine().toLowerCase();
        }
        while(playagain.equals("yes "));

        System.out.println("thanks for playing.");

        teste.close();
    }
}
