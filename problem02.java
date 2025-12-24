import java.util.Scanner;

public class problem02 {

    public static void main(String[] args){

        // MAD LIBS GAME

        Scanner game = new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.print("Enter an Adjective (description): ");
        adjective1 = game.nextLine();
        System.out.print("Enter a noun (animal or person): ");
        noun1 = game.nextLine();
        System.out.print("Enter an Adjective (description): ");
        adjective2 = game.nextLine();
        System.out.print("Enter a verb end with -ing (action): ");
        verb1 = game.nextLine();
        System.out.print("Enter an Adjective (description): ");
        adjective3 = game.nextLine();

        System.out.println("\nToday i went to a " + adjective1 + " zoo.");
        System.out.println("in a exhibit, i saw a " + noun1 + ".");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.println("i was " + adjective3 + "!");

        game.close();
    }
}
