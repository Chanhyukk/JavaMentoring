package Week6;

public class AHello extends Hello implements Bye {
    private String name;
    public AHello(String name) {
        super();
        this.name = name;
    }
    public void sayHello() {
        System.out.println(name + " 안녕하세요");
    }
    public String getName() {
        return name;
    }

}
