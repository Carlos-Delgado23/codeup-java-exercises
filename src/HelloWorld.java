import java.util.ArrayList;

public class HelloWorld {


    public static void main(String[] args) {
        System.out.println("Hello, World!");
//        System.out.print("Hello, ");
//        System.out.print("World!");


//        SYNTAX, TYPES, AND VARIABLES       //
        int myFavoriteNumber = 23;
        System.out.println(myFavoriteNumber);

        String myString = "Hellooo!";
        System.out.println(myString);

        float myNumber = 3.14f;
        System.out.println(myNumber);

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
//        System.out.println(++x);
//        System.out.println(x);

//        int three = (int) "three";
//        System.out.println(three);

//        int x = 4;
//        x = x + 5;

//        int x = 3;
//        int y = 4;
//        y = y * x;

        int x = 10;
        int y = 2;
        x = x / y;
        y = y - x;
        System.out.println(x);
        System.out.println(y);


    }

//    ArrayList<Integer> testInput = new ArrayList<>();

    public static ArrayList<Integer> intArray(ArrayList<Integer> numsArr) {
        int totalMultiplied = 1;
        for (int i = 0; i < numsArr.size(); i++) {
            totalMultiplied *= numsArr.get(i);
        }
        System.out.println(totalMultiplied);

        ArrayList<Integer> returnArr = new ArrayList<>();

        for (int j = 0; j < numsArr.size(); j++) {
            int placeHolder = totalMultiplied / numsArr.get(j);
            returnArr.add(placeHolder);
        }
        return returnArr;
    }

}
