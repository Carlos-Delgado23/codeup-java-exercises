package movies;

import util.Input;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MoviesApplication {
    public static void main(String[] args){
        System.out.println(menuChoice());
    }


//    ALL MOVIES LOOP   //
    public static String allMovies(){
        Movie[] movies = MoviesArray.findAll();
        for (int i = 0; i < movies.length; i++) {
            System.out.println(movies[i].getName() + " -- " + movies[i].getCategory());
        }
        return "";
    }


//    CATEGORY LOOP     //
    public static String categoryLoop(String catChoice){
        Movie[] movies = MoviesArray.findAll();

        for(int i = 0; i < movies.length; i++){
            if (movies[i].getCategory().equals("animated") && catChoice.equalsIgnoreCase("animated")){
                System.out.println(movies[i].getName());

            } else if(movies[i].getCategory().equals("drama") && catChoice.equalsIgnoreCase("drama")){
                System.out.println(movies[i].getName());

            } else if(movies[i].getCategory().equals("horror") && catChoice.equalsIgnoreCase("horror")) {
                System.out.println(movies[i].getName());

            } else if(movies[i].getCategory().equals("scifi") && catChoice.equalsIgnoreCase("scifi")) {
                System.out.println(movies[i].getName());
            }
        }
        return "";
    }


//    MENU AND CHOICE OPTIONS   //
    public static String menuChoice(){
        Input userChoice = new Input();

        System.out.println("What would you like to do?\n\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n");

        int choice = userChoice.getInt("Enter your choice: ", 0, 5);
        if (choice == 1){
            System.out.println("\n========== Available Movies ==========");
            allMovies();
        } else if(choice == 2){
            System.out.println("\n========== Animated Movies ==========");
            categoryLoop("animated");
        } else if(choice == 3){
            System.out.println("\n========== Drama Movies ==========");
            categoryLoop("drama");
        } else if(choice == 4){
            System.out.println("\n========== Horror Movies ==========");
            categoryLoop("horror");
        } else if(choice == 5){
            System.out.println("\n========== SciFi Movies ==========");
            categoryLoop("scifi");
        }
        return "";
    }
}
