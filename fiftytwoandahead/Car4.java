package fiftytwoandahead;

public class Car4 {

    private String model;
    private int year;
    private Engine motor;

    public Car4(String model, int year, String motortype){
        this.model = model;
        this.year = year;
        this.motor = new Engine(motortype);
    }
    public String getmodel(){
        return model;
    }
    public int getyear(){
        return year;
    }
    public Engine getmotor(){
        return this.motor;
    }

    public void start(){
        this.motor.start();
        System.out.println("The " + this.model + " is running");
    }
}
