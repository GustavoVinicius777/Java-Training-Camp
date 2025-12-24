import java.util.Scanner;

public class ifstatements {
    public static void main(String[] args) {
        //if statements = performs a block of code if its condition is what you want it to be, commonly true statement.

        Scanner ale = new Scanner(System.in);

        int age;
        double price;
        double nota;

        System.out.print("Whats the grade of the student: ");
        nota = ale.nextDouble();

        if(nota >= 5){
            System.out.println("You Passed! Congratulations.");
        }
        else {
            System.out.println("Im sorry, you do NOT passed.");
        }

        System.out.print("Whats your age?: ");
        age = ale.nextInt();

        if(age >= 18){
            System.out.println("Your an adult.");
        }
        else if(age <= 0){
            System.out.println("Its impossible for you not to have been born yet hahaha");
        }
        else {
            System.out.println("your just a child.");
        }

        ale.close();
    }
}
