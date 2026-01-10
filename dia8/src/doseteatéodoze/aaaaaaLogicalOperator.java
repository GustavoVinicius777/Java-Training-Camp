package doseteatéodoze;

import java.util.Scanner;

public class aaaaaaLogicalOperator {
    static void main(String[] args){

        // && = AND -- To the code work with this metric [&&] is needed that the ALL conditions had to be true.
        // used to check more than one condition at the same time

        // || = OR -- its is used when only just one condition is needed to be true.

        // !  = NOT -- its check if the value is not true.

        // Example number one.

        /*
        double temp = -20;
        boolean issunny = false;

        if(temp <= 30 && temp >= 0 && issunny){
            System.out.println("The weather is GOOD for a walk");
            System.out.println("It is SUNNY outside");
        }
        else if(temp <= 30 && temp >= 0 && !issunny){
            System.out.println("The weather is GOOD for a walk");
            System.out.println("It is CLOUDY outside");
        }
        else if(temp > 30 || temp < 0){
            System.out.println("The weather is bad ");
        }
        */

        // Example number two

        Scanner operadores = new Scanner(System.in);

        // username must be between 4-12 characteres
        // username must not contain spaces or underscores

        String username;

        System.out.print("Enter your new username: ");
        username = operadores.nextLine();

        if(username.length() < 4 || username.length() > 12){
            System.out.println("Username must be between 4-12 carachters");
        }
        else if(username.contains(" ") || username.contains("_")){
            System.out.println("Username must not contain any spaces or underscores");
        }
        else{
            System.out.println("Welcome "+ username);
        }

        operadores.close();
    }
}