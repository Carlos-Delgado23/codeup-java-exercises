package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
    protected int length;
    protected int width;

    public Quadrilateral(int length, int width){
        this.length = length;
        this.width = width;
    }

    public int getLength(){
        return this.length;
    }
    public int getWidth(){
        return this.width;
    }
    public abstract void setLength(int length);
    public abstract void setWidth(int width);

    @Override
    public double getPerimeter() {
        int perimeter;
            perimeter = (2 * length) + (2 * width);
            return perimeter;
    }

    @Override
    public double getArea() { return length * width; }
}
