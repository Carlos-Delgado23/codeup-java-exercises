package shapes;

public class Rectangle {
    protected int length;
    protected int width;

    public Rectangle(int recLength, int recWidth){
        this.length = recLength;
        this.width =  recWidth;
    }

    public int getArea(){
        int area;
        area = length * width;
        return area;
    }

    public int getPerimeter(){
        int perimeter;
        perimeter = (2 * length) + (2 * width);
        return perimeter;
    }


}

