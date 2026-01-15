package InheritanceLessons;

public class Plants extends Organism {

    public Plants(boolean alive) {
        super(alive);
    }

    void photosynthesize(){
        System.out.println("The plant is absorbing sunlight... ");
    }
}
