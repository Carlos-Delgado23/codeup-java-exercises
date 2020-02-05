package shapes;

public class ShapesTest {
    public static void main(String[] args){
        Measurable myShape;
        myShape = new Square(5, 5);
        System.out.println(myShape.getPerimeter() + " -- "+ myShape.getArea());
        myShape = new Rectangle(4,5);
        System.out.println(myShape.getPerimeter() + " -- "+ myShape.getArea());

//        Rectangle box1 = new Rectangle(4, 5);
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());
//
//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());
    }
}
