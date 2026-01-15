package Abstraction;

public abstract class Shape {

    abstract double area(); // ABSTRACT METHOD

    public static void display(){ // CONCRETE METHOD
        System.out.println("This is a shape");
    }
}
