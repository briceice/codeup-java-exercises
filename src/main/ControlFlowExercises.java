package main;

import javax.swing.*;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15){
//            System.out.printf("%d ", i);
//            i++;

//        int count = 100;
//        do {
//            System.out.printf("%d\n", count);
//            count -= 5;
//        } while (count >= -10);

//        int sqrCount = 2;
//        do {
//            System.out.printf("%d\n", sqrCount);
//            sqrCount = (int) Math.pow(sqrCount, 2);
//        } while (sqrCount <= 1000000);

//        for (int i = 5; i <= 15; i++) {
//            System.out.printf("%d ", i);
//        }

//        for (int i = 100; i >= -10 ; i-=5) {
//            System.out.printf("%d\n", i);
//        }

//        for (int i = 2; i <= 1000000; i = (int) Math.pow(i, 2)) {
//            System.out.printf("%d\n", i);
//        }

//        for (int i = 1; i <= 100; i++) {
//            if((i % 3 ==0) && (i % 5 ==0)){
//                System.out.println("FizzBuzz");
//                continue;
//            }
//            if(i % 3 == 0){
//                System.out.println("Fizz");
//            }
//            if(i % 5 ==0){
//                System.out.println("Buzz");
//            }
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter an int: ");
        int userInput = scanner.nextInt();
        System.out.println("Here is your table");
        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");
        for (int i = 1; i <= userInput; i++) {
            System.out.printf("%-6d | %-7.0f | %-5.0f\n", i, Math.pow(i, 2), Math.pow(i, 3));
        }

        System.out.print("Enter grade: ");
        double grade = scanner.nextDouble();
        if (grade >= 88) {
            System.out.println("A: 100-88");
        } else if (grade >= 80) {
            System.out.println("B: 87-80");
        } else if (grade >= 67) {
            System.out.println("C: 79-67");
        } else if (grade >= 60) {
            System.out.println("D: 66-60");
        } else {
            System.out.println("F: 59-0");
        }
    }
}
