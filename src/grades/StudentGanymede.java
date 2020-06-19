package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class StudentGanymede {
    private String name;
    private ArrayList<Integer> grades;

    public StudentGanymede(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage(){
        double total = 0;
        for (int grade : grades){
            total += grade;
        }
        return (total / grades.size());
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

//    public void setGrades(ArrayList<Integer> grades) {
//        this.grades = grades;
//    }


    public static void main(String[] args) {
        StudentGanymede charlie = new StudentGanymede("Charlie");

        charlie.addGrade(99);
        charlie.addGrade(89);
        charlie.addGrade(82);
        charlie.addGrade(80);
        charlie.addGrade(95);
        System.out.println(charlie.getGrades());
        System.out.println(charlie.getGradeAverage());
    }
}
