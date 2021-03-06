import java.util.Date;
public class Student {
    String name;
    String cohort;
    Date startDate;
    String program;
    boolean drinksCoffee;
    String location;

    public static void main(String[] args) {
        Student daniel = new Student();
        daniel.name = "Daniel";
        daniel.cohort = "Europa";
        daniel.startDate = new Date("06/11/2018");
        daniel.program = "Web Development";
        daniel.location = "San Antonio";
        daniel.drinksCoffee = true;
        Student zach = new Student();
        zach.name = "Zach";
        zach.cohort = "Bayes";
        zach.startDate = new Date("February 11, 2017");
        zach.program = "Data Science";
        zach.location = "San Antonio";
        zach.drinksCoffee = false;
        System.out.println(daniel.report());
//        if(zach.drinksCoffee)
//        System.out.println(zach.name + "drinks coffee.");
    }
    public String report() {
        String output = "";
        output += "My name is " + this.name + ". ";
        output += "I started learning " + this.program + " with " + this.cohort + "on" + this.startDate + ",";
        if (this.drinksCoffee)
            output += "I drink coffee in " + this.location + ".";
        else
            output += "I don't drink coffee in" + this.location + ".";
        return output;
    }
}