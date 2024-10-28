package Week4;

public class Child extends Parent {
    private int value;
    public Child(String name, int value) {
        super(name);
        this.value = value;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
}
