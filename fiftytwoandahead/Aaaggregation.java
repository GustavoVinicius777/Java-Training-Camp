package fiftytwoandahead;

public class Aaaggregation {
    static void main(String[] args){

        // Aggregation = Represents a "has-a" relationship between objects.
        //               One object contains another object as part of its structure,
        //               but the contained object/s can exist independently.

        Book livro1 = new Book("Harry Potter", 350);
        Book livro2 = new Book("diario de um banana 1", 300);
        Book livro3 = new Book("diario de um banana 2", 256);

        Book[] livros = {livro1, livro2, livro3};

        Library livraria = new Library("Girl who stoles", 1, livros);

        livraria.DisplayInfo();

        //for(fiftytwoandahead.Book livro : livros){
        //    System.out.println(livro.displayinfo());
        //}

        // System.out.println(livro1.displayinfo());
        // System.out.println(livro2.displayinfo());
        // System.out.println(livro3.displayinfo());
    }
}
