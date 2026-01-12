import java.util.Random;
import java.util.Scanner;

public class AaaAaaSlotMachine {

    static Scanner tigre = new Scanner(System.in);

    static void main(String[] args){

        // SLOT MACHINE

        int balance = 100;
        int bet;
        int payout;

        String[] row;
        String playagain;

        System.out.println("*********************");
        System.out.println(" Welcome java slots");
        System.out.println("Symbols: ❤️🤞👻👽🐯 ");
        System.out.println("*********************");

        while(balance > 0){
            System.out.println("Current balance: R$" + balance);
            System.out.print("Place your bet amount: ");
            bet = tigre.nextInt();
            tigre.nextLine();

            if(bet > balance){
                System.out.println("INSUFFICIENT FUNDS");
                continue;
            }
            else if(bet <= 0){
                System.out.println("Bet must be greater than 0");
                continue;
            }
            else{
                balance -= bet;
            }
            System.out.println("Spinning...");
            row = spinrow();
            printrow(row);
            payout = getpayout(row, bet);

            if(payout > 0){
                System.out.println("You won R$" + payout);
                balance += payout;
            }
            else{
                System.out.println("Sorry you lost this round");
            }

            System.out.print("Do you want to play again? [Y/N]: ");
            playagain = tigre.nextLine().toUpperCase();

            if(!playagain.equals("Y")){
                break;
            }
        }

        System.out.println("GAME IS OVER! Your final balance is $:" + balance);

        tigre.close();
    }
    static String[] spinrow(){

        String[] symbols = {"❤️", "🤞", "👻", "👽", "🐯"};
        String[] row = new String[3];
        Random res = new Random();

        for(int i = 0; i < 3; i++){
            row[i] = symbols[res.nextInt(symbols.length)];
        }

        return row;
    }
    static void printrow(String[] row){

        System.out.println("*********************");
        System.out.println("" + String.join(" | ", row));
    }
    static int getpayout(String[] row, int bet){

        if(row[0].equals(row[1]) && row[1].equals(row[2])){
            return switch(row[0]){
                case "❤️" -> 3;
                case "🤞" -> 5;
                case "👻" -> 7;
                case "👽" -> 10;
                case "🐯" -> 14;

                default -> 0;
            };
        }
        else if(row[0].equals(row[1])) {
            return switch (row[0]) {
                case "❤️" -> 2;
                case "🤞" -> 3;
                case "👻" -> 4;
                case "👽" -> 5;
                case "🐯" -> 6;

                default -> 0;
            };
        }
        else if(row[1].equals(row[2])) {
            return switch (row[1]) {
                case "❤️" -> 2;
                case "🤞" -> 3;
                case "👻" -> 4;
                case "👽" -> 5;
                case "🐯" -> 6;

                default -> 0;
            };
        }
        else if(row[0].equals(row[2])) {
            return switch (row[0]) {
                case "❤️" -> 2;
                case "🤞" -> 3;
                case "👻" -> 4;
                case "👽" -> 5;
                case "🐯" -> 6;

                default -> 0;
            };
        }

        return 0;
    }

}
