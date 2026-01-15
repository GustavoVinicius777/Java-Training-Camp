import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){

        //testing the users input system
        Scanner entrada= new Scanner(System.in);

        System.out.println("Type your Name: ");
        String name = entrada.nextLine();

        System.out.print("Type your Age: ");
        int age = entrada.nextInt();

        System.out.println("What is your GPA: ");
        double gpa = entrada.nextDouble();

        System.out.println("Are you a student? (true/false): ");
        boolean isStudent = entrada.nextBoolean();

        System.out.println("Hello, welcome: " + name);
        System.out.println("Confirm your Age: " + age);
        System.out.println("Your GPA is: " + gpa);

        if(isStudent){
            System.out.println("You are enrolled as a student");
        }
        else{
            System.out.println("You are NOT enrolled");
        }


        entrada.close();



    }
}
