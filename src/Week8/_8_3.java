package Week8;

import java.io.*;

public class _8_3 {
    public static void main(String[] args) throws Exception{
        FileInputStream f = new FileInputStream("./src/Week8/alice.txt");
        int c;
        do {
            c = f.read();
            System.out.print((char) c);
        } while (c != -1);
        f.close();
        FileReader fr = new FileReader("./src/Week8/alice.txt");
        int d;
        do {
            d = fr.read();
            System.out.print((char) d);
        } while (d != -1);
        fr.close();
    }
}
