package LastPart;

public class AaaAMultiThreading {
    static void main(String[] args){

        // Multithreading = Enables a program to run multiple threads concurrently
        //                  (Thread = a set of instructions that run independently)
        //                  Useful for background tasks or time-consuming operations

        // jeito 1
        /*
        LastPart.meurunnable  runnable = new LastPart.meurunnable();
        Thread thread = new Thread(runnable);
        thread.start();
        */

        // jeito 2
        /*
        Thread thread = new Thread(new LastPart.meurunnable());
        thread.start();
        */

        Thread thread1 = new Thread(new meurunnable("PING"));
        Thread thread2 = new Thread(new meurunnable("PONG"));

        System.out.println("GAME STARTS!");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        }
        catch(InterruptedException e){
        System.out.println("Main Thread was interrupted ");
        }

        System.out.println("GAME OVER MY BOY!");
    }
}
