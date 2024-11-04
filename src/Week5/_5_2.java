package Week5;

public class _5_2 {
    public static void main(String[] args) {
        Turtle t = new Turtle();
        t.setFood("Jelly");
        t.eat();
        System.out.println(t.getLimbs());
        SeaTurtle s = new SeaTurtle();
        System.out.println(s.getLimbs());
        System.out.println(s.limbs);
        LandTurtle l = new LandTurtle();
        System.out.println(l.getLimbs());
        l.walk();
    }
}
