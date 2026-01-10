package trezeatedezoito;

import java.util.Scanner;

public class aaaBankingProgram {

    static Scanner banco = new Scanner(System.in);

    static void main(String[] args){

        // JAVA BANKING PROGRAM FOR BEGINNERS

        // Declare Variables
        double Balance = 0;
        boolean isrunning = true;
        int choice;

        while(isrunning) {
            // display menu
            System.out.println("***************");
            System.out.println("BANKING PROGRAM");
            System.out.println("***************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("***************");

            // get and procress users choice
            System.out.print("Enter your choice (1-4): ");
            choice = banco.nextInt();

            switch (choice) {
                case 1 -> showbalance(Balance);
                case 2 -> Balance += deposit();
                case 3 -> Balance -= withdraw(Balance);
                case 4 -> isrunning = false;
                default -> System.out.println("Invalid Choice!");
            }
        }

        // EXIT MESSAGE
        System.out.println("Thank you, Have a nice day");

        banco.close();
    }

    // showbalance()
    static void showbalance(double balance){
        System.out.println("***************");
        System.out.printf("R$%.2f \n", balance);
    }

    //deposit()
    static double deposit(){

        double amount;

        System.out.print("Enter an amount to be deposited: ");
        amount = banco.nextDouble();

        if(amount < 0){
            System.out.println("Amount cant be negative");
            return 0;
        }
        else{
            return amount;
        }
    }

    // withdraw()
    static double withdraw(double balance) {

        double amount;

        System.out.print("Enter the amount to be withdrawn: ");
        amount = banco.nextDouble();

        if (amount > balance) {
            System.out.println("Insuficient money");
            return 0;
        } else if (amount < 0) {
            System.out.println("Amount can´t be negative!");
            return 0;
        } else {
            return amount;
        }
    }
}