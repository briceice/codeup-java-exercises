package main;

import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean repeat = true;
        do {
            System.out.print("Say something to Bob: ");
            String input = scanner.nextLine().trim();
            if (input.endsWith("?")) {
                System.out.println("Sure");
            } else if (input.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (input.equals("")) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever.");
            }
            if (input.equals("Ok Bob I can't talk with you all day when you have so little to say.")) {
                repeat = false;
            }
        } while (repeat);
    }
}
