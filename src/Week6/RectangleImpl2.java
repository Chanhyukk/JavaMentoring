package Week6;

public class RectangleImpl2 extends Rectangle implements IShape, IShape2{
    public RectangleImpl2(double width, double height) {
        super(width, height);
    }
    public double getArea() {
        return width * height;
    }
    public double getPerimeter() {
        return 2 * (width + height);
    }
    public int getNumOfPoints() {
        return 4;
    }
}
