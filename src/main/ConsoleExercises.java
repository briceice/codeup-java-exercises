package main;

import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f.\n", pi);

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");

        System.out.printf("Enter int: ");
        int userInput = scanner.nextInt();
        System.out.printf("You entered: %d\n", userInput);

        System.out.printf("Enter 3 words: ");
        String input1 = scanner.next();
        String input2 = scanner.next();
        String input3 = scanner.next();
        System.out.printf("1: %s\n2: %s\n3: %s\n", input1, input2, input3);

        scanner.nextLine();

        System.out.printf("Enter sentence: ");
        String inputSentence = scanner.nextLine();
        System.out.printf("Your sentence: %s\n", inputSentence);

        System.out.printf("Enter length: ");
        double length = scanner.nextDouble();
        System.out.printf("Enter width: ");
        double width = scanner.nextDouble();
        double area = length * width;
        double perimeter = 2*length + 2*width;
        System.out.printf("Area: %.2f, Perimeter: %.2f\n", area, perimeter);
        System.out.printf("Enter height: ");
        double height = scanner.nextDouble();
        double volume = length * width * height;
        System.out.printf("Volume: %.2f", volume);
        scanner.close();
    }
}
