package main;

import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        highLow();
    }

    public static void highLow(){
        boolean nextGuess = true;
        int guesses = 0;
        int userGuess = 0;
        int num = (int) (Math.random()*100 + 1);
        System.out.println(num);
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Guess a number 1-100: ");
            if (!scanner.hasNextInt()){
                System.out.println("I need a number");
                scanner.nextLine();
                continue;
            } else {
                userGuess = scanner.nextInt();
                scanner.nextLine();
                if (userGuess < num){
                    System.out.println("HIGHER");
                }
                if (userGuess > num){
                    System.out.println("LOWER");
                }
                if (userGuess == num){
                    System.out.println("GOOD GUESS!");
                    nextGuess = false;
                }
            }
            guesses += 1;
        } while (nextGuess);
        if (guesses == 1){
            System.out.print("First Try!!");
        } else {
            System.out.printf("That took %d guesses!", guesses);
        }
        scanner.close();
    }


}
