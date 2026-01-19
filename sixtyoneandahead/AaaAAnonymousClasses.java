package sixtyoneandahead;

public class AaaAAnonymousClasses {
    static void main(String[] args){

        // Anonymous Class = A class that doesn't have a name. Cannot be refused.
        //                   Add custom behavior without having to create a new class.
        //                   Often used for one time uses (TimerTask, Runnable, callbacks)

        Dog1 cao1 = new Dog1();
        Dog1 cao2 = new Dog1(){
            @Override
            void speak(){
                System.out.println("Scoob Doo Says *Ruh Roh*");
            }
        };

        cao1.speak();
        cao2.speak();
    }
}
