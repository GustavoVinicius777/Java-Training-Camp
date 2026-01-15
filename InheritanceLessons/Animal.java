package InheritanceLessons;

public class Animal extends Organism {

    public Animal(boolean alive) {
        super(alive);
    }

    public void eat(){
    System.out.println("Your animal is eating...");
    }
}
