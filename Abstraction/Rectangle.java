package Abstraction;

public class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    public double getlength(){
        return length;
    }
    public double getwidth(){
        return width;
    }

    @Override
    public double area(){
        return length * width;
    }
}
