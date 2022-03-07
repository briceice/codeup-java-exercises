package main.util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    // Constructor
    public Input() {
        this.scanner = new Scanner(System.in);
    }

    // Methods
    public void close(){
        this.scanner.close();
    }

    public String getString(String prompt){
        System.out.println(prompt);
        return this.scanner.nextLine();
    }

    public boolean yesNo(String prompt){
        System.out.println(prompt);
        String input = this.scanner.nextLine();
        return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
    }

    public int getInt(String prompt, int min, int max){
        do {
            System.out.println(prompt);
            if (!this.scanner.hasNextInt()){
                this.scanner.nextLine();
                continue;
            }
            int userInt = this.scanner.nextInt();
            this.scanner.nextLine();
            if (userInt >= min && userInt <= max){
                return userInt;
            }
        } while (true);
    }

    public int getInt(String prompt){
        do {
            System.out.println(prompt);
            if (!this.scanner.hasNextInt()){
                this.scanner.nextLine();
                continue;
            }
            int userInt = this.scanner.nextInt();
            this.scanner.nextLine();
            return userInt;
        } while (true);
    }

    public double getDouble(String prompt, double min, double max){
        do {
            System.out.println(prompt);
            if (!this.scanner.hasNextDouble()){
                this.scanner.nextLine();
                continue;
            }
            double userDouble = this.scanner.nextDouble();
            this.scanner.nextLine();
            if (userDouble >= min && userDouble <= max){
                return userDouble;
            }
        } while (true);
    }

    public double getDouble(String prompt){
        do {
            System.out.println(prompt);
            if (!this.scanner.hasNextDouble()){
                this.scanner.nextLine();
                continue;
            }
            double userDouble = this.scanner.nextDouble();
            this.scanner.nextLine();
            return userDouble;
        } while (true);
    }
}
