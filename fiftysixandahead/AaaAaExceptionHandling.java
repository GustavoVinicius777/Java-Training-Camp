package fiftysixandahead;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AaaAaExceptionHandling {


    static void main(String[] args){

        // Exception = An event that interrupts a normal flow of a program
        //            (Dividing by zero, file not found, mismatch input type)
        //            Surround any dangerous code with a try{} block
        //            try{}, catch{}, finally{}

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            int usernum = scanner.nextInt();
            System.out.println(usernum);
        } catch (InputMismatchException a) {
            System.out.println("That wasn't a number!");
        } catch (ArithmeticException b) {
            System.out.println("You can't divide by zero!");
        } catch (Exception c) {
            // SAFETY NET
            System.out.println("Something went wrong!");
        } finally {
            System.out.println("This always executes!");
        }
    }
}
