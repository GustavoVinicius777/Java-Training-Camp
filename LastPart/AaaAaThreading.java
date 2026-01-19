package LastPart;

import java.util.Scanner;

public class AaaAaThreading {

    static Scanner scanner = new Scanner(System.in);
    static void main(String[] args){

        // Threading = Allows a program to run multiple tasks simultaneously
        //             Helps improve performance with time-consuming operations
        //             (File I/O, Network communications, or any background tasks)

        // How to create a thread
        // Option 1. Extend the Thread class (simpler)
        // Option 2. Implement the Runnable interface (better)

        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.setDaemon(true);
        thread.start();

        System.out.println("You have 5 seconds to enter your name!");
        System.out.print("Enter Your Name Here: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        scanner.close();
    }
}
