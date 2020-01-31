import java.util.Scanner;

public class Scrap {

    //    GLOBAL VARIABLES  //
    private static String playerName;
    private static int player2Health = 100;
    private static int roundKick = 20 ;
    private static int jab = 8;
    private static int gutHit = 3;
    private static int player1Health = 100;
    private static int potion = 30;



    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String start = "y";
        System.out.println("Ready to Start? [yes/no] ");
        start = scanner.nextLine();

//        NAME        //
        while(start.equalsIgnoreCase("yes")){
            name();
            System.out.println("FIGHT!");
            player1Dice();

            start = "no";
        }

    }



//    INTRO     //
    public static void name(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name? ");
        playerName = scanner.nextLine();
        System.out.println("NO ONE CARES!!!");

    }

    public static void player1Dice (){
        int diceRoll = 0;
        int numSides = 7;
        String fight;

        System.out.println("PLAYER ONE:\nPress F to fight, R to run.");
        Scanner scan = new Scanner(System.in);
        fight = scan.nextLine();

        while(player1Health >= 0 && player2Health >= 0 ){
            if (fight.equalsIgnoreCase("F")){
                diceRoll = (int) Math.round(Math.floor(Math.random() * numSides + 1));

                if (diceRoll == 1){
                    System.out.println("*uh!*\nThat hurt!\n");
                    player2Health = player2Health - roundKick;
                } else if (diceRoll == 3 || diceRoll == 6){
                    System.out.println("Is that all you got?!\n");
                    player2Health = player2Health - jab;
                } else if (diceRoll == 2 || diceRoll == 4){
                    System.out.println("That tickled!\n");
                    player2Health = player2Health - gutHit;
                } else if (diceRoll == 5) {
                    System.out.println("DRINK UP!\n");
                    player1Health = player1Health + potion;
                    player1Dice();
                    System.out.println("Go again!");
                } else {
                    System.out.println("You missed!\n");
                }
                System.out.println("PLAYER ONE: " +player1Health+ "\t PLAYER TWO: " +player2Health + "\n");
                player2Dice();
            } else {
                System.out.println("PLAYER TWO WINS!");
            }
        }
    }




    public static void player2Dice() {
        int diceRoll = 0;
        int numSides = 7;
        String fight;

        System.out.println("PLAYER TWO:\nPress F to fight, R to run.");
        Scanner scan = new Scanner(System.in);
        fight = scan.nextLine();

        while (player1Health >= 0 && player2Health >= 0) {
            if (fight.equalsIgnoreCase("f")) {
                diceRoll = (int) Math.round(Math.floor(Math.random() * numSides + 1));

                if (diceRoll == 1) {
                    System.out.println("*uh!*\nThat hurt!\n");
                    player1Health = player1Health - roundKick;
                } else if (diceRoll == 3 || diceRoll == 6) {
//                    System.out.println("===============================");
                    System.out.println("Is that all you got?!\n");
                    player1Health = player1Health - jab;
                } else if (diceRoll == 2 || diceRoll == 4) {
                    System.out.println("That tickled!\n");
                    player1Health = player1Health - gutHit;
                } else if (diceRoll == 5) {
                    System.out.println("DRINK UP!\n");
                    player2Health = player2Health + potion;
                    player2Dice();
                    System.out.println("Go again!");
                } else {
                    System.out.println("You missed!\n");
                }
                System.out.println("PLAYER ONE: " + player1Health + "\t PLAYER TWO: " + player2Health + "\n");
                player1Dice();

            } else {
                System.out.println("PLAYER ONE WINS!");
            }
        }
    }



}
