package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;
    private String username;
    public Student(){
        //default constructor
    }



    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage(){
        double sum = 0;
        double total = 0;
        for(Integer grade : this.grades){
            sum += grade;
            total++;
        }
        return sum / total;
    }



//    GETTERS
    // returns the students name
    public String getName() { return this.name; }
    // returns the students grades
    public ArrayList<Integer> getGrades() { return this.grades; }
    public String getUsername() { return username; }

    //    SETTERS
    public void setName(String name) { this.name = name; }
    public void setGrades(ArrayList<Integer> grades) { this.grades = grades; }
    public void setUsername(String username) { this.username = username; }
}
