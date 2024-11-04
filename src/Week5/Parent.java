package Week5;

public class Parent {
    private String name;

    Parent() {
        this.name = null;
    }

    Parent(String name) {
        this.name = name;
    }
    protected String getName() { return name; }
    public void setName(String name) { this.name = name; }
}

