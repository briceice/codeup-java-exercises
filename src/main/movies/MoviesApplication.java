package main.movies;

import main.util.Input;

import java.util.Objects;

public class MoviesApplication {
    public static void main(String[] args) {
        Input input = new Input();
        do {
            int userInput = input.getInt("What would you like to do?\n" +
                    "\n" +
                    "0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view all moves in the animated category\n" +
                    "3 - view all moves in the drama category\n" +
                    "4 - view all moves in the horror category\n" +
                    "5 - view all moves in the scifi category\n" +
                    "\n" +
                    "Enter your choice: ", 0, 5);
            if (userInput == 0){
                break;
            }
            if (userInput == 1){
                for (int i = 0; i < MoviesArray.findAll().length; i++) {
                    System.out.println(MoviesArray.findAll()[i].getName() + " -- "
                            + MoviesArray.findAll()[i].getCategory());
                }
                System.out.println();
            }
            if (userInput == 2){
                for (int i = 0; i < MoviesArray.findAll().length; i++) {
                    if (Objects.equals(MoviesArray.findAll()[i].getCategory(), "animated")){
                        System.out.println(MoviesArray.findAll()[i].getName() + " -- "
                                + MoviesArray.findAll()[i].getCategory());
                    }
                }
                System.out.println();
            }
            if (userInput == 3){
                for (int i = 0; i < MoviesArray.findAll().length; i++) {
                    if (Objects.equals(MoviesArray.findAll()[i].getCategory(), "drama")){
                        System.out.println(MoviesArray.findAll()[i].getName() + " -- "
                                + MoviesArray.findAll()[i].getCategory());
                    }
                }
                System.out.println();
            }
            if (userInput == 4){
                for (int i = 0; i < MoviesArray.findAll().length; i++) {
                    if (Objects.equals(MoviesArray.findAll()[i].getCategory(), "horror")){
                        System.out.println(MoviesArray.findAll()[i].getName() + " -- "
                                + MoviesArray.findAll()[i].getCategory());
                    }
                }
                System.out.println();
            }
            if (userInput == 5){
                for (int i = 0; i < MoviesArray.findAll().length; i++) {
                    if (Objects.equals(MoviesArray.findAll()[i].getCategory(), "scifi")){
                        System.out.println(MoviesArray.findAll()[i].getName() + " -- "
                                + MoviesArray.findAll()[i].getCategory());
                    }
                }
                System.out.println();
            }
        } while (true);
    }
}
