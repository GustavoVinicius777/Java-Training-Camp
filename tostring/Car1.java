package tostring;

public class Car1 {

    private String make;
    private String model;
    private int year;
    private String color;

    public Car1(String make, String model, int year, String color){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
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
    public String getcolor(){
        return color;
    }

    @Override
    public String toString(){
        return this.make + " " + this.model + " " + this.year + " " + this.color;
    }
}
