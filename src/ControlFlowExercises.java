import javax.swing.*;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
//        WHILE     //
//        int i = 5;
//
//        while (i <= 15){
//            System.out.print(i + " ");
//            i++;
//        };


//        DO WHILE       //
//        int i = 0;
//        do {
//            System.out.println(i);
//            i+=2;
//        } while (i <= 100);

//        DO WHILE (count backwards by 5's from 100 to -10)       //
//        int i = 100;
//        do {
//            System.out.println(i);
//            i-=5;
//        } while (i >= -10);

//        DO WHILE      //
// loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000.//
//         int i = 2;
//         do {
//             System.out.println(i);
//            i = (int) Math.pow(i, 2);
//         }while(i < 100000);


//        FIZZ BUZZ IN JAVA     //
//        for (int i = 1; i < 100; i++) {
//            if (i % 15 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//        }



//        TABLE OF POWERS       //
//        System.out.println("What number would you like to go up to?");
//        int userNumber = (int) scanner.nextFloat();
//
//        System.out.println("Here is your table!\n");
//
//        System.out.println("number | squared | cubed");
//        System.out.println("------ | ------- | -----");
//
//        for (var i = 1; i <= userNumber; i++){
//            int squared = (int) Math.pow(i, 2);
//            int cubed = (int) Math.pow(i, 3);
//
//            System.out.println(i + "      | " + squared + "      | " + cubed);
//        }


//        CONVERT NUMBER TO LETTER DEPENDING ON GRADE       //
//        Convert given number grades into letter grades.

        System.out.println("Enter a numerical grade from 0 to 100:");
        int userGrade = (int) scanner.nextDouble();
        String userContinue;
        String grade = "";

        do {
            if(userGrade >= 88) {
                grade = "A";
            }else if (userGrade >= 80){
                grade = "B";
            }else if (userGrade >= 67){
                grade = "C";
            }else if (userGrade >= 60){
                grade = "D";
            }else if (userGrade >= 0){
                grade = "F";
            }
            System.out.println("Grade: "+ grade);
            System.out.print("Continue? [y/N] ");
            userContinue = scanner.next();
        } while (userContinue.equalsIgnoreCase("y"));

    }
}