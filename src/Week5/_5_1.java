package Week5;

public class _5_1 {
    public static void main(String[] args) {
        Parent p = new Parent("kim");
        System.out.println(p.getName());
        Child c = new Child("kang", 5);
        System.out.println(c.getValue());
        System.out.println(c.getName());
    }
}
