package Week8;

import java.util.Formatter;

public class _8_1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Formatter f = new Formatter(sb);
        f.format("Hello %s", "World");
        f.format(" RRR");
        System.out.println(f);
        String s = f.toString();
        System.out.println(s);
    }
}
