package doseteatéodoze;

import java.util.Scanner;

public class aaaaaWhileLoops {
    static void main(String[] args){

        // while loops = repeat some code forever
        //               while some condition remains true

        Scanner enquanto = new Scanner(System.in);

        // problem nummber 1
        /*
        String name = "";

        while(name.isEmpty()){
            System.out.print("Enter your name: ");
            name = enquanto.nextLine();
        }

        System.out.println("Hello " + name);
        */

        // exercicio 2
        /*
        String response = " ";

        while(!response.equals("R")){
            System.out.println("You are playing a game.");
            System.out.println("Press r to quit: ");
            response = enquanto.next().toUpperCase();
        }

        System.out.println("You have quited the game sucessfully.");
        */

        /*
        int age = 0;

        System.out.println("Enter your age: ");
        age = enquanto.nextInt();

        while(age < 0){
            System.out.println("Your age can´t be negative");
            System.out.println("Enter your age: ");
            age = enquanto.nextInt();
        }

        System.out.println("You are " + age + "Years old");
        */


        // do while: When you command the machine to do the code and check after

        /*
        int age = 0;

        do{
            System.out.println("Your age can´t be negative");
            System.out.println("Enter your age: ");
            age = enquanto.nextInt();
        }
        while(age < 0);

        System.out.println("You are " + age + " Years old");
        */

        int number = 0;

        do{
            System.out.println("Enter a number who must be between 1 - 10:  ");
            number = enquanto.nextInt();
        }
        while(number < 1 || number > 10);

        System.out.println("You picked " + number);

        enquanto.close();
    }
}
