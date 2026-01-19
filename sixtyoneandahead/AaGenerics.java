package sixtyoneandahead;

public class AaGenerics {
    static void main(String[] args){

        // Generics = A concept where you can write a class, interface, or method.
        //            that is compatible with different data types.
        //            <T> type parameter (placeholder that replaced with a real type)
        //            <String> type argument (specifies the type)
        //            inside the diamonds <> can be any type (char, boolean, etc..)

        /*
        sixtyoneandahead.Box<String> box = new sixtyoneandahead.Box<>();

        box.setItem("banana");

        System.out.println(box.getItem());
         */

        Product<String, Double> produto1 = new Product<>("Apple", 0.15);
        Product<String, Integer> produto2 = new Product<>("Ticket", 10);

        System.out.println(produto1.getitem());
        System.out.println("R$" + produto1.getprice());

        System.out.println(produto2.getitem());
        System.out.println("R$" + produto2.getprice());
    }
}
