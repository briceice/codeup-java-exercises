package main.shapes;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.pow(this.radius, 2) * Math.PI;
    }
    public double getCircumference(){
        return 2 * Math.PI * this.radius;
    }
}
