import java.util.Scanner;

public class MethodsExercises {
    public static void main (String[] args){


//       System.out.println(add(3, 5));
//       System.out.println(subtract(3,5));
//       System.out.println(multiply(3,5));
//       System.out.println(rMultiply(3,5));
//       System.out.println(divide(3,5));

       System.out.print(getInteger(1, 10));
    }


//    STEP ONE OF EXERCISE    //
    public static long add(long a, long b) {
        return a + b;
    }
    public static long subtract(int a, int b){
        return a - b;
    }
    public static int multiply(int a, int b){
        return a * b;
    }
    public static int rMultiply(int a, int b){
        if(a == 0 || b == 0){
            return b;
        } else if (a == 1){
            return b;
        } else {
            return b + rMultiply(a - 1, b);
        }
    }
    public static long divide(int a, int b){
        return a / b;
    }



//    STEP TWO & THREE OF EXERCISES      //
    public static int getInteger(int min, int max){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 10: ");
        int userInput = scanner.nextInt();

        if (userInput > max){
            System.out.print("Your number is greater than max: ");
            return userInput;
        } else if (userInput < min) {
            System.out.print("Your number is less than min: ");
            return userInput;
        } else {
            System.out.print("Your number is in range: ");
            return userInput;
        }

    }



}
