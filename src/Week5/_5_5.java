package Week5;

public class _5_5 {
    public static void main(String[] args) {
        RectangleImpl r = new RectangleImpl(2,3);
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());
        RectangleImpl2 r2 = new RectangleImpl2(1,2);
        System.out.println(r2.getArea());
        System.out.println(r2.getPerimeter());
    }
}
