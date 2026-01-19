package sixtyoneandahead;

public class Product <T, U>{

    T item;
    U price;

    public Product(T item, U price){
        this.item = item;
        this.price = price;
    }
    public T getitem(){
        return item;
    }
    public U getprice(){
        return price;
    }
}
