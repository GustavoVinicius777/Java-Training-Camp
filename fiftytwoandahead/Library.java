package fiftytwoandahead;

public class Library {

    private String name;
    private int year;
    private Book[] livros1;

    public Library(String name, int year, Book[] livros1){
        this.name = name;
        this.year = year;
        this.livros1 = livros1;
    }
    public String getname(){
        return this.name;
    }
    public int getyear(){
        return this.year;
    }
    public Book[] getlivros1(){
        return this.livros1;
    }
    public void DisplayInfo(){
        System.out.println("The " + this.year + " " + this.name );
        System.out.println("Books available: ");
        for(Book livro : livros1){
        System.out.println(livro.displayinfo());
        }
    }
}
