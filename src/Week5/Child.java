package Week5;

public class Child extends Parent {
    private int value;

    Child(int value) {
        this.value = value;
        System.out.println("default");
    }

    Child(String name, int value) {
        super(name);
        this.value = value;
        System.out.println("super");
    }
    public int getValue() { return value; }
    public void setValue(String name) { this.value = value; }
    public String getName() {
        return "Parent's name is " + super.getName();
    }
    public String getName(String name) {
        return "My name is " + name + "and parent's name is " + getName();
    }
    public String toString() {
        return getName() + getValue() + "";
    }
}
