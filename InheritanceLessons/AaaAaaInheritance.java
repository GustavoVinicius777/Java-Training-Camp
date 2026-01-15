package InheritanceLessons;

public class AaaAaaInheritance {
    static void main(String[] args){

        // inheritance = One class inherits the attributes and methods
        //               from another class
        //               child <- parents <- grandparents

        Plants plantas = new Plants(true);
        Dog cachorro = new Dog(true);
        Cat gato = new Cat(true);

        System.out.println(cachorro.isalive());
        System.out.println(gato.isalive());
        System.out.println(plantas.isalive());

        cachorro.eat();
        gato.eat();
        plantas.photosynthesize();

        // Showing that they get the inheritance but are not directly correlative
        // exemplo1:
        // cachorro.photosynthesize();
    }
}
