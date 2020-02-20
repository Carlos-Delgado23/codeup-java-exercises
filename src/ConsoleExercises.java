import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){

//        STEP ONE       //
//        double pi = 3.14159;
//        System.out.format("The value of pi is approximately %s", pi);

        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter something: ");
//        int userInput = scanner.nextInt();
//        System.out.println("You entered: --> \"" + userInput + "\" <--");


//        STEP TWO       //
//        System.out.print("Enter three words: ");
//        String wordOne = scanner.next();
//        String wordTwo = scanner.next();
//        String wordThree = scanner.next();
//
//        System.out.println("You entered: --> \n\"" + wordOne + "\n" + wordTwo + "\n" + wordThree + "\"");

//        STEP THREE  & STEP FOUR     //
//        System.out.print("Enter a sentence: ");
////        String userSentence = scanner.next();
//        String userSentence = scanner.nextLine();
//        System.out.println("You entered: --> \"" + userSentence + "\"");

//        STEP FIVE      //
//        System.out.print("Enter width: ");
//        String width = scanner.nextLine();
//        System.out.print("Enter length: ");
//        String length = scanner.nextLine();
//        float area = Float.parseFloat(length) * Float.parseFloat(width);
//        float perimeter = (Float.parseFloat(length) * 2) + (Float.parseFloat(width) * 2);
//        System.out.println("Your area is: -->" + area);
//        System.out.println("Your perimeter is: -->" + perimeter);

        scanner.useDelimiter(" "); // delimiter could be anything that and is used instead of having to tap enter to
        // go to the following line.
        System.out.print("\nHey! Enter width: ");
        double width = scanner.nextFloat();
        System.out.print("Enter length: ");
        double length = scanner.nextFloat();
        System.out.printf("The dimensions are %f by %f. The perimeter is %f and the area is %f.\n", length, width,
                2*(length+width), length*width);
    }
}
