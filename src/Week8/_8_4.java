package Week8;

import java.io.*;

public class _8_4 {
    public static void main(String[] args) throws Exception{
        FileReader fr = new FileReader("./src/Week8/alice.txt");
        BufferedReader br = new BufferedReader(fr);
        /*int data;
        do {
            data = br.read();
            System.out.print((char) data);
        } while (data != -1);*/
        String line = br.readLine();
        while (line != null) {
            System.out.println(line);
            line = br.readLine();
        }
        br.close();
        fr.close();
    }
}
