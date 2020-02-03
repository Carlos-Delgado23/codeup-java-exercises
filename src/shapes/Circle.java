package shapes;

import java.sql.SQLOutput;

public class Circle {
    private static int circlesCreated = 0;
    private double radius;

    public Circle(double radius){
        this.radius = radius;
        circlesCreated++;
    }
    public double getArea(){
        System.out.println("Your area is = ");
        return Math.PI * this.radius * this.radius;
    }
    public double getCircumference(){
        System.out.println("Your circumference is = ");
        return 2 * this.radius * Math.PI;
    }
    public static int getCirclesCreated(){
        return circlesCreated;
    }
}
