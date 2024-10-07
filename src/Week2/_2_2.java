package Week2;

public class _2_2 {
    public static void main(String[] args) {
        Hello[] hello = new Hello[3];
        hello[0] = new Hello();
        hello[1] = new Hello("홍길동");
        hello[2] = new Hello("허균");
        for (int i = 0; i < hello.length; i++) { // for
            hello[i].sayHello();
        }
        for (Hello h : hello) { // for each
            h.sayHello();
        }
    }
}
