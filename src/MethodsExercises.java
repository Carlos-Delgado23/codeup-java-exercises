import java.util.Scanner;

public class MethodsExercises {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);


//       System.out.println(add(3, 5));
//       System.out.println(subtract(3,5));
//       System.out.println(multiply(3,5));
//       System.out.println(rMultiply(3,5));
//       System.out.println(divide(3,5));
//       System.out.println(modulus(5, 3));

//       getInteger(1, 10);
//        String intConfirm = "y";
//        while(intConfirm.equalsIgnoreCase("y")){
//            System.out.println(getInteger(1, 10));
//            System.out.print("enter y to continue: ");
//            intConfirm = scanner.next();
//        }

       System.out.print(factorial(1, 10));
//        String confirm = "y";
//        while(confirm.equalsIgnoreCase("y")){
//            System.out.println(factorial(1, 10));
//            System.out.print("enter y to continue: ");
//            confirm = scanner.next();
//        }

//        dice();
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

    public static long modulus(int a, int b){
        return a % b;
    }



//    STEP TWO OF EXERCISE      //
    public static int getInteger(int min, int max){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between " + min + " and " + max + ": ");
        int userInput = scanner.nextInt();

            if (userInput > max){
                System.out.println("Your number is greater than max");
//                System.out.println(userInput);
                getInteger(min, max);
            } else if (userInput < min) {
                System.out.println("Your number is less than min");
//                System.out.println(userInput);
                getInteger(min, max);
            } else {
                System.out.println("Your number is in range");
//                System.out.println(userInput);
//                return userInput;
            }
        return userInput;
    }

//    STEP THREE OF EXERCISES      //
    public static long factorial(int min, int max){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between" + min + "and" + max + ": ");
         int userNum = scanner.nextInt();
         long fact = 1;

         if (userNum < max && userNum > min){
             for (int i = 2; i <= userNum; i++) {
                 fact *= i;
             }
             return fact;
         } else {
             System.out.print("Number isn't valid ");
             return userNum;
         }
    }

//    STEP FOUR OF EXERCISES      //
    public static void dice (){
        int dice1 = 0;
        int dice2 = 0;
        int numSides = 0;
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("How many sides per die (2 dice)? ");
            numSides = getInteger(2, 21);
            dice1 = (int) Math.round(Math.floor(Math.random() * numSides + 1));
            dice2 = (int) Math.round(Math.floor(Math.random() * numSides + 1));
            System.out.printf("%d + %d = %d\n", dice1, dice2, (int)add(dice1,dice2));
            System.out.println("Would you like to roll again? ");
            String answer = scan.next();
            if (answer.toLowerCase().contains("n")) return;
        }
    }

}
