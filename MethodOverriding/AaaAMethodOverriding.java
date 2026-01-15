package MethodOverriding;

public class AaaAMethodOverriding {
    static void main(String[] args){

        // Method overrinding = When a subclass provides its own
        //                      Implementation of a method that is already defined
        //                      Allows for code reusability and give specific implementations

        Dog cao = new Dog();
        Cat gato = new Cat();
        Fish peixe = new Fish();

        cao.move();
        gato.move();
        peixe.move();
    }
}
