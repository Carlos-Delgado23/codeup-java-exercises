package movies;

import util.Input;

import java.util.Arrays;
import java.util.Scanner;

public class MoviesApplication {
    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);

        System.out.println(menuChoice());
    }

    public static String menuChoice(){
        Input userChoice = new Input();
        MoviesArray movies = new MoviesArray();
        Movie movie = new Movie();

        System.out.println("What would you like to do?\n\n" +

                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n");

        System.out.print("Enter your choice: ");
        int choice = userChoice.getInt();

        while (choice >= 0 || choice <= 5) {

            if (choice == 1) {
                System.out.println("\n========== All Movies ==========");
                System.out.println(Arrays.toString(movies.findAll()));
                System.out.println("\n");
                return menuChoice();
            } else if (choice == 2 && movie.getCategory().equals("animated")){
                System.out.println("\n========== Animated Movies ==========");
                System.out.println(movie.getName());

            }
//            System.out.println(choice);
        }
        return menuChoice();
    }


}
