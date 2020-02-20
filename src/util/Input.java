package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }



   public String getString(){
       return this.scanner.next();
    }

    public String getString(String prompt){
        return this.scanner.next();
    }

    public boolean yesNo(){
        String answer;
        System.out.println("What is your answer? (yes/no)");
        answer = getString();
        return answer.toLowerCase().startsWith("y");
    }

    public boolean yesNo(String prompt){
        String answer;
        System.out.println(prompt);
        answer = getString();
        return answer.toLowerCase().startsWith("y");
    }

    public int getInt(String prompt, int min, int max){
//       System.out.println(prompt);
       int userNum = getInt();
       while (min > userNum || max < userNum){
           userNum = getInt();
       }
//       System.out.printf("Great your number is within %d and %d \n", min, max);
       return userNum;
    }



    public double getDouble(String prompt, double min, double max){
//       System.out.println(prompt);
       double userNumber = getDouble();
       while(min > userNumber || max < userNumber){
           userNumber = getDouble();
       }
       System.out.printf("Great your number is within %f and %f \n", min, max);
       return userNumber;
    }


    public double getDouble(){
       return this.scanner.nextDouble();
    }
    public int getInt() { return this.scanner.nextInt(); }


    public int getInt(String prompt) {
        int answer = 0;
        do {
            System.out.println(prompt);

            String response = this.scanner.nextLine();
            try{
                answer = Integer.valueOf(response);
            } catch (NumberFormatException nfe){
                System.out.println("Error");
            }
        } while (answer == 0);

        return answer;
    }



}
