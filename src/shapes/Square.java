package shapes;

public class Square extends Quadrilateral{
    public Square(int length, int width) {
        super(length, width);
    }

    @Override
    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
    }

//    int side;
//
//    public Square(int side){
//        super(side, side);
//        this.side = side;
//    }
//
//    public int getPerimeter(){
//        return 4 * side;
//    }
//
//    public int getArea(){
//        return side ^ 2;
//    }






}
