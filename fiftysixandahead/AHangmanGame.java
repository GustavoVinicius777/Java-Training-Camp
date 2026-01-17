package fiftysixandahead;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class AHangmanGame {

    static Scanner guess1 = new Scanner(System.in);

    static void main(String[] args){

        // JAVA HANGMAN GAME

        String filepath = "words.txt";
        ArrayList<String> words = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(filepath))){
            String line;
            while((line = reader.readLine()) != null){
                words.add(line.trim());
            }
        }
        catch(FileNotFoundException a){
            System.out.println("Could not find file");
        }
        catch(IOException e){
            System.out.println("Something went wrong");
        }

        if (words.isEmpty()) {
            System.out.println("Word list is empty. Check words.txt file.");
            return;
        }

        Random ale = new Random();

        String word = words.get(ale.nextInt(words.size()));

        ArrayList<Character> wordstate = new ArrayList<>();
        int wrongguesses = 0;

        for(int i = 0; i < word.length(); i++){
            wordstate.add('_');
        }

        System.out.print("Welcome to java hangman game!");

        while(wrongguesses < 6){

            System.out.print(gethangmanart(wrongguesses));

            System.out.print("Word: ");

            for(char c : wordstate){
                System.out.print(c + " ");
            }
            System.out.println();

            System.out.print("Guess a letter: ");
            char guess = guess1.next().toLowerCase().charAt(0);

            if(word.indexOf(guess) >= 0){
                System.out.println("Correct guess!");

                for(int i = 0; i < word.length(); i++){
                    if(word.charAt(i) == guess){
                        wordstate.set(i, guess);
                    }
                }

                if(!wordstate.contains('_')){
                    System.out.print(gethangmanart(wrongguesses));
                    System.out.println("You win, congrats buddy! :)");
                    System.out.println("The word was: " + word);
                    break;
                }
            }
            else{
                wrongguesses++;
                System.out.println("Wrong guess! \n");
            }
            //fim do while
        }

        if(wrongguesses >= 6){
            System.out.print(gethangmanart(wrongguesses));
            System.out.println("Game Over Buddy, Good lucky next time!");
            System.out.println("The word was: " + word);
        }

        guess1.close();
    }
    static String gethangmanart(int wrongguesses){

        return switch(wrongguesses){

            case 0 -> """
                    
                    
                    
                    """;
            case 1 -> """
                      o
                    
                    
                    """;
            case 2 -> """
                      o
                      |
                    
                    """;
            case 3 -> """
                      o
                     /|
                    
                    """;
            case 4 -> """
                      o
                     /|\\
                    
                    """;
            case 5 -> """
                      o
                     /|\\
                     /
                    """;
            case 6 -> """
                      o
                     /|\\
                     / \\
                    """;

            default -> " ";
        };
    }
}
