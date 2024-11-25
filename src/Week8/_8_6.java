package Week8;

import java.io.*;

public class _8_6 {
    public static void main(String[] args) throws Exception{
        FileReader r = new FileReader("./src/Week8/alice.txt");
        FileWriter w = new FileWriter("./src/Week8/copy.txt");
        int data = r.read();
        char ch;
        while(data != -1){
            ch = (char)data;
            w.write(ch);
            data = r.read();
        }
        r.close();
        w.close();
    }
}
