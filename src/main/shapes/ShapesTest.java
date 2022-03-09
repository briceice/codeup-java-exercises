package main.shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape = new Rectangle(5, 10);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
    }

//    Why does the code fail to compile if you leave off the getPerimeter method in Rectangle?
//      Rectangle is not an abstract class and therefor must implement the abstract methods from the
//      abstract classes it extends/implements
//    What happens if you try to call the getLength or getWidth methods of the myShape variable? Why?
//      java: cannot find symbol
//      because neither the Measurable instance nor Rectangle class have a getLength() method
}
