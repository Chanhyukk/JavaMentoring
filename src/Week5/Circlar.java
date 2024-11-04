package Week5;

public class Circlar {
    private double radius;
    private Pointer p;
    public Circlar (int xnew, int ynew, int rnew) {
        p = new Pointer(xnew, ynew);
        radius = rnew;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
    public String toString() {
        return "x: " + p.getX() + ", y: " + p.getY()
                + "\nradius: " + radius + "\narea: " + getArea()
                + "\ncircumference: " + getCircumference();
    }
}
