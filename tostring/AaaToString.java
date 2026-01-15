package tostring;

public class AaaToString {
    static void main(String[] args){

        // .toString() = Method inherited from the object class.
        //               Used to return a String representation of an object.
        //               By default, it returns a hash code as a unique identifier.
        //               It can be overridden to provide meaningful details

        Car1 carro1 = new Car1("Ford", "Suv", 1998, "Red");
        Car1 carro2 = new Car1("Hyunday", "HB20", 2006, "Brown");

        /*
        System.out.println(carro.getmake());
        System.out.println(carro.getmodel());
        System.out.println(carro.getyear());
        System.out.println(carro.getcolor());
        */
        System.out.println(carro1);
        System.out.println(carro2);

    }
}
