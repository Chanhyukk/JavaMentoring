package Week2;

public class Hello {
    String name = "No Name";
    public Hello() {}
    public Hello(String name) {
        setWhom(name);
    }
    String getWhom() {
        return name;
    }
    void setWhom(String name) {
        this.name = name;
    }
    void sayHello() {
        System.out.println("Name is " + getWhom());
    }
}
