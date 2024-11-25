package Week8;

import java.io.FileOutputStream;
import java.io.IOException;

public class _8_5 {
    public static void main(String[] args) throws IOException {
        FileOutputStream f = new FileOutputStream("./src/Week8/test.txt");
        String s = "Hello, World!";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            f.write(c);

        }
    }
}
