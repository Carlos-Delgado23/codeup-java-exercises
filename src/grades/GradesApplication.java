package grades;

import util.Input;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

//  STUDENTS
        Student john = new Student("John");
        john.setUsername("robotron3000");
        john.addGrade(65);
        john.addGrade(80);
        john.addGrade(92);

        Student luis = new Student("Luis");
        luis.setUsername("iGoByLouis");
        luis.addGrade(100);
        luis.addGrade(100);
        luis.addGrade(60);

        Student stacy = new Student("Stacy");
        stacy.setUsername("Rainbow.brite69");
        stacy.addGrade(95);
        stacy.addGrade(100);
        stacy.addGrade(74);

        Student louis = new Student("Stacy");
        louis.setUsername("lePetitePrince");
        louis.addGrade(95);
        louis.addGrade(100);
        louis.addGrade(70);

    //  Putting students GitHub usernames in the hashmap
        students.put(john.getUsername(), john);
        students.put(luis.getUsername(), luis);
        students.put(stacy.getUsername(), stacy);
        students.put(louis.getUsername(), louis);



//  COMMAND LINE INTERFACE
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome!\n\n" + "Here are the GitHub usernames of out students: \n");
        System.out.println("|" + john.getUsername() + "| |" +  luis.getUsername() + "| |" + stacy.getUsername() +
                "| |" + louis.getUsername() + "|\n");

    //  continue loop with students info upon request
        Input cont = new Input();
        boolean yesNoCont;

        do {
            System.out.println("What student would you like to see more information on?");
            String studentRequest = scan.nextLine();

            if(students.containsKey(studentRequest)){
                System.out.println("Name: "+ students.get(studentRequest).getName() +" - GitHub Username: "+ students.get(studentRequest).getUsername());
                System.out.printf("Current Average: %.2f\n", students.get(studentRequest).getGradeAverage());
            } else {
                System.out.printf("Sorry, no student found with the GitHub username of \"%s\".\n\n", studentRequest);
            }
            yesNoCont = cont.yesNo("Would you like to see another student? [yes/no]\n");
        } while(yesNoCont);

        System.out.println("Goodbye, and have a wonderful day!");


    }
}
