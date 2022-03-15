package main.util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
//        System.out.println(input.getString("enter a string"));
//        System.out.println(input.yesNo("yes or no?"));
        System.out.println(input.getInt("enter int 1-100", 1, 100));
        System.out.println(input.getDouble("enter double 1-100", 1, 100));
    }
}
