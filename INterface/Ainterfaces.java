package INterface;

public class Ainterfaces {
    static void main(String[] args){

        // Interfaces = A blueprint for a class that specifies a set of abstract method.
        //              that implementing classes MUST define.
        //              Supports multiple inheritance-like behavior.

        Rabbit coelho = new Rabbit();
        Hawk falcao = new Hawk();
        Fish peixe = new Fish();

        coelho.flee();
        falcao.hunt();
        peixe.flee();
        peixe.hunt();
    }
}
