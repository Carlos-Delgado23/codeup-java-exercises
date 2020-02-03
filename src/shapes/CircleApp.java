package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        double radius = input.getDouble("what is the radius? ", 4, 5);
        Circle circle = new Circle(radius);
        System.out.println(circle.getArea());
        System.out.println(circle.getCircumference());

    }
}
