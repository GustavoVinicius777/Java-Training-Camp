package fiftytwoandahead;

public class AaaAGetterSetter {
    static void main(String[] args){

        // They help protect object data and add rules for acessing or modifying them.
        // GETTER = Methods that make a field READABLE.
        // SETTER = Methods that make a field WRITEABLE.

        Car3 carro = new Car3("SUV", "Grey", 7500);

        carro.setmodel("Off-road");
        carro.setprice(-100);

        System.out.println(carro.getmodel());
        System.out.println(carro.getcolor());
        System.out.println(carro.getprice());
    }
}
