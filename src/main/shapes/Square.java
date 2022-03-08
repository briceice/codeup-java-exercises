package main.shapes;

public class Square extends Rectangle{
    protected int side;

    public Square(int side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public int getArea() {
        System.out.println("sqr getArea");
        return side * side;
    }

    @Override
    public int getPerimeter() {
        System.out.println("sqr getPerim");
        return 4 * side;
    }
}
