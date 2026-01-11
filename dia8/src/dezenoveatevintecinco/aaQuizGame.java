package dezenoveatevintecinco;

import java.util.Scanner;

public class aaQuizGame {

    static Scanner quiz = new Scanner(System.in);

    static void main(String[] args){

        // java quiz game

        String[] questions = {"What is the man function of a router?",
                              "Which part of the computer is considered the brain?",
                              "What year was facebook launched?",
                              "Who is know as the father of computers?",
                              "What was the first programming language?"};

        String[][] options = {{"1. Storing files", "2. Encrypting data", "3. Directing internet traffic", "4. managing passwords"},
                              {"1. CPU", "2. harddrive", "3. RAM", "4. GPU"},
                              {"1. 2000", "2. 2004", "3. 2006", "4. 2008"},
                              {"1. Steve jobs", "2. bill gates", "3. alan turing", "4. charles babbage"},
                              {"1. COBOL", "2. C", "3. Fortran", "4. Assembly"}};

        int[] answers = {3, 1, 2, 4, 3};
        int score = 0;
        int guess;

        System.out.println("*****************************");
        System.out.println("Welcome to the Java Quiz Game");
        System.out.println("*****************************");

        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);

            for(String option : options[i]){
                System.out.println(option);
            }
            System.out.print("Enter your guess: ");
            guess = quiz.nextInt();

            if(guess == answers[i]){
                System.out.println("Correct!");
                score++;
            }
            else{
                System.out.println("Wrong");
            }
        }

        System.out.println("Your final score is: " + score + " out of " + questions.length);

        quiz.close();
    }
}
