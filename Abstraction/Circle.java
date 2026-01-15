package Abstraction;

public class Circle extends Shape {

    double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    public double getradius(){
        this.radius = radius;
        return 0;
    }

    @Override
    public double area(){
        return Math.PI * radius * radius;
    }
}
