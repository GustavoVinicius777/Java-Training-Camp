package Abstraction;

public class AaAbstraction {
    static void main(String[] ignoreargs){

        // Abstract = used to define abstract classes and methods.
        //            Abstraction is the process of hiding implementation details.
        //            and showing only the essential features.
        //            Abstract classes CAN'T be instantiated directly
        //            can contain 'abstract' methods (which must be implemented).
        //            can contain 'concrete' methods (which inherited).

        Circle circulo = new Circle(3);
        Triangle triangulo = new Triangle(4, 5);
        Rectangle retangulo = new Rectangle(6, 7);

        System.out.println(circulo.area());
        System.out.println(triangulo.area());
        System.out.println(retangulo.area());

        Circle.display();
    }
}
