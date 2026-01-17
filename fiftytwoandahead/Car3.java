package fiftytwoandahead;

public class Car3 {

    private String model;
    private final String color;
    private int price;

    public Car3(String model, String color, int price){
        this.model = model;
        this.color = color;
        this.price = price;
    }
    public String getmodel(){
        return model;
    }
    public String getcolor(){
        return color;
    }
    public String getprice(){
        return "R$" + price;
    }
    public void setmodel(String model){
        this.model = model;
    }
    public void setprice(int price){
        if(price < 0){
            System.out.println("Price can't be less than zero");
        }
        else{
            this.price = price;
        }
    }
}
