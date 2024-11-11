package Week6;

public class France extends AHello {
    public France(String name) {
        super(name);
    }
    public void sayHello() {
        System.out.println("Bonjour " + super.getName());
    }
}
