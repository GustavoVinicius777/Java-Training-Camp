public class Car {

    private String make;
    private String model;
    private int year;
    private double price;

    public Car(String make, String model, int year, double price){
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }
    public String getmake(){
        return make;
    }
    public String getmodel(){
        return model;
    }
    public int getyear(){
        return year;
    }
    public double getprice(){
        return price;
    }
}
