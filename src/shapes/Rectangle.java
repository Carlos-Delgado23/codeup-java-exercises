package shapes;

public class Rectangle extends Quadrilateral {
    public Rectangle(int length, int width) {
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
//        protected int length;
//        protected int width;
//
//        public Rectangle(int recLength, int recWidth){
//            this.length = recLength;
//            this.width =  recWidth;
//        }
//
//        public int getArea(){
//            int area;
//            area = length * width;
//            return area;
//        }
//
//        public int getPerimeter(){
//            int perimeter;
//            perimeter = (2 * length) + (2 * width);
//            return perimeter;
//        }


}

