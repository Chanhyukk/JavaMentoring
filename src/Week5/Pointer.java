package Week5;

public class Pointer {
    private int x;
    private int y;
    public Pointer() {

    }
    public Pointer(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public String toString() {
        return "x: " + x + ", y: " + y;
    }
}

