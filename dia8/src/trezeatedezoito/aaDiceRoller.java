package trezeatedezoito;

import java.util.Random;
import java.util.Scanner;

public class aaDiceRoller {
    static void main(String[] args){

        // Java dice program

        Scanner dado = new Scanner(System.in);
        Random ale = new Random();
        int numofdice;
        int total = 0;

        System.out.print("Enter the # of dice to roll: ");
        numofdice = dado.nextInt();

        if(numofdice > 0){

            for(int i = 0; i < numofdice; i++){
                int roll1 = ale.nextInt(1, 7);
                System.out.println("You rolled: " + roll1);
                total += roll1;
            }
            System.out.println("Total: " + total);
        }
        else{
            System.out.println("# of dice must be greater than 0");
        }
        dado.close();
    }
    static void printDie(int roll1){

        String dice1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;

        String dice2 = """
                 -------
                | ●     |
                |       |
                |     ● |
                 -------
                """;

        String dice3 = """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
                """;

        String dice4 = """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
                """;

        String dice5 = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                """;

        String dice6 = """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------
                """;

        switch(roll1){
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);

            default -> System.out.print("Invalid roll");
        }
    }
}
