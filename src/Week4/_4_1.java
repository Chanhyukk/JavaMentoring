package Week4;

public class _4_1 {
    public static void main(String[] args) {
        Child c = new Child("hello", 3);
        System.out.println(c.getName());
        System.out.println(c.getValue());
        Parent p = new Child("world", 13);
        System.out.println(p.getName());
        //System.out.println(p.getValue());
    }
}
