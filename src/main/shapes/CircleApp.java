package main.shapes;

import main.util.Input;

public class CircleApp {
    public static void main(String[] args) {
        makeCircles();
    }

    public static void makeCircles(){
        Input input = new Input();
        boolean repeat = true;
        int circlesMade = 0;
        do {
            double radius = input.getDouble("enter radius");
            Circle circle = new Circle(radius);
            System.out.println("Area = " + circle.getArea());
            System.out.println("Circumference = " + circle.getCircumference());
            repeat = input.yesNo("Create another circle?");
            circlesMade++;
        } while (repeat);
        System.out.printf("You made %d circles", circlesMade);
        input.close();
    }
}
