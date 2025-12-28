import java.util.Scanner;

public class ifstatements {
    public static void main(String[] args) {
        //if statements = performs a block of code if its condition is what you want it to be, commonly true statement.

        Scanner ale = new Scanner(System.in);

        String nome;
        int age;
        double nota;
        boolean estudante;

        //group 1
        System.out.print("Enter your name: ");
        nome = ale.nextLine();

        //group 2
        System.out.println("Are you a Student? type(true/false): ");
        estudante = ale.nextBoolean();

        //group 3
        System.out.print("Whats the grade of the student: ");
        nota = ale.nextDouble();

        //group 4
        System.out.print("Whats your age?: ");
        age = ale.nextInt();

        //outputs == group 1
        if(nome.isEmpty()){
            System.out.println("You dont typed your name yet.");
        }
        else
        {
            System.out.println("Hello " + nome + " ;)");
        }

        //outputs == group2
        if(estudante){
            System.out.println("Your a Student, congratulations!");
        }
        else{
            System.out.println("Your NOT a Student.");
        }

        //outputs == group 3
        if(nota >= 5){
            System.out.println("You Passed! Congratulations.");
        }
        else {
            System.out.println("Im sorry, you do NOT passed.");
        }

        //outputs == group 4
        if(age >= 65){
            System.out.println("Your a Senior.");
        }
        else if(age >= 18){
            System.out.println("Your an adult.");
        }
        else if(age <= 0){
            System.out.println("Its impossible for you not to have been born yet hahaha.");
        }
        else {
            System.out.println("your just a child.");
        }

        //close the Scanner functionality
        ale.close();
    }
}
