package Week5;

public class RectangleImpl2 extends Rectangle implements IShape{
    public RectangleImpl2(double width, double height) {
        super(width, height);
    }
    public double getArea() {
        return width * height;
    }
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
