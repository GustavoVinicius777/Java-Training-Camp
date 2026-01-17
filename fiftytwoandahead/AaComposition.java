package fiftytwoandahead;

public class AaComposition {
    static void main(String[] args){

        // Composition = Represents a "part-of" relationship between objects.
        //               For example, an fiftytwoandahead.Engine is "part of" a car.
        //               Allows complex objects to be constructed from smaller objects.

        Car4 carro = new Car4("Suv", 1987, "V8");

        System.out.println(carro.getmodel());
        System.out.println(carro.getyear());
        System.out.println(carro.getmotor().gettype());

        carro.start();

    }
}
