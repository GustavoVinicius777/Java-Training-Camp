public class Car {

    private String make;
    private String model;
    private int year;
    private double price;

    public Car() {
        this.make = "Fiat";
        this.model = "Uno";
        this.year = 2025;
        this.price = 9870.99;
    }

    // getters
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }
}
