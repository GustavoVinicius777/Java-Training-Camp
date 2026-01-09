package seisprimeiros;

import java.util.Scanner;

public class aaaaaweightconverter {
    static void main(String[] args){

        // WEIGHT CONVERSION PROGRAMM

        // declare variables
        Scanner peso = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        // welcome mensage
        System.out.println("welcome in to my: Weight conversion programm");
        System.out.println("you can choose between 2 options: ");
        System.out.println("for option 1: you convert libras into kilograms.");
        System.out.println("for option 2: you convert kilograms into libras.");
        System.out.println(" ");

        System.out.print("choose what you want, for option 1 type[1] for option 2 type [2]: ");
        choice = peso.nextInt();

        if(choice == 1){
            System.out.print("insert the libras you want to convert into kilograms: ");
            weight = peso.nextDouble();

            newWeight = weight * 0.453592;

            System.out.printf("here the weight in kilograms: %.2f", newWeight);

        }
        else if(choice == 2){
            System.out.print("insert the kilograms you want to convert into libras: ");
            weight = peso.nextDouble();

            newWeight = weight * 2.20462;

            System.out.printf("here the weight in libras:  %.2f", newWeight);
        }
        else{
            System.out.println("You have to use a valid answer like 1 or 2, any other type of input gonna result in a error.");
        }

    }
}
