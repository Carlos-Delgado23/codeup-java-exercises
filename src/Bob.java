import java.util.Scanner;

public class Bob {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ask or yell at Bob. Bob isn't nice.: ");

        String userInput = scanner.nextLine();
        Scanner userContinue = new Scanner(System.in);
        do {
            if (userInput.endsWith("?")){
                System.out.println("Sure!");
                continue;
            } else if (userInput.endsWith("!")){
                System.out.println("Whoa, chill out!");
                continue;
            } else if (userInput.isEmpty()){
                System.out.println("Fine. Be that way!");
                continue;
            } else {
                System.out.println("Whatever");
            }
//            System.out.print("Continue? [y/n] ");
        } while(userContinue.next().equalsIgnoreCase("y"));
//        userContinue.close();




    }
}

