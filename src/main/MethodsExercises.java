package main;

import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
//        System.out.println(add(1,1));
//        System.out.println(subtract(2,1));
//        System.out.println(multiply(2,5));
//        System.out.println(divide(10,2));
//        System.out.println(modulus(10,3));
//        System.out.println(multiplyWithoutSign(5,10));
        getInteger(1,10);
        getFactorial();
//        System.out.println(getFib(8));
        rollDice();

    }

    public static int add(int num1, int num2){
        return num1 + num2;
    }

    public static int subtract(int num1, int num2){
        return num1 - num2;
    }

    public static int multiply(int num1, int num2){
        return num1 * num2;
    }

    public static int divide(int num1, int num2){
        return num1 / num2;
    }

    public static int modulus(int num1, int num2){
        return num1 % num2;
    }

    public static int multiplyWithoutSign(int num1, int num2){
//        FOR LOOP
//        int result = 0;
//        for (int i = 0; i < num2; i++) {
//            result += num1;
//        }
//        return result;

//        RECURSION
        if(num2 == 0 || num1 == 0){
            return 0;
        }
        return num1 + multiplyWithoutSign(num1, num2 - 1);
    }

    public static int getInteger(int min, int max){
        System.out.printf("Please enter a number between %d and %d: ", min, max);
        Scanner scanner = new Scanner(System.in);
        int userNum = scanner.nextInt();
        if(userNum >= min && userNum <= max){
            System.out.println("Noted...");
            return userNum;
        }
        return getInteger(min, max);
    }

    public static long getFactorial(){
        System.out.print("Please enter a number between 1 and 20: ");
        Scanner scanner = new Scanner(System.in);
        int userNum = scanner.nextInt();
        long factorial = 1;
        if (!(userNum >= 1 && userNum <= 20)){
            getFactorial();
        } else {
            for (int i = 1; i <= userNum ; i++) {
                factorial *= i;
            }
            System.out.printf("%d! = %,d\n", userNum, factorial);
        }
        scanner.nextLine();
        System.out.println("Find another factorial? (y/n)");
        String response = scanner.nextLine();
        if (!response.equalsIgnoreCase("y")) {
            return factorial;
        }
        return getFactorial();
    }

//    public static long getFib(int num){
//        if(num == 0){
//            return 0;
//        }
//        if(num == 1){
//            return 1;
//        }
//        return getFib(num-1) + getFib(num-2);
//    }

    public static void rollDice(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many sides to a die? ");
        int sides = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Roll dice? (y/n) ");
        String confirm = scanner.nextLine().trim();
        if (!confirm.equalsIgnoreCase("y")) {
            return;
        }
        boolean repeat = true;
        do {
            dice(sides);
            scanner.nextLine();
            System.out.print("Roll again? (y/n) ");
            String checkRepeat = scanner.nextLine();
            if(!checkRepeat.equalsIgnoreCase("y")){
                repeat = false;
            }
        } while (repeat);
    }

    public static void dice(int n){
        int die1 = (int) (java.lang.Math.random()*n + 1);
        int die2 = (int) (java.lang.Math.random()*n + 1);
        System.out.printf("You rolled %d and %d. (hit enter to continue)", die1, die2);
    }
}
