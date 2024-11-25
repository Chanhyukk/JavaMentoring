package Week8;

import java.io.*;
import java.util.Scanner;

public class _8_2 {
    public static void main(String[] args) throws Exception {
        FileInputStream f = new FileInputStream("./src/Week8/circle.txt");
        Scanner sc = new Scanner(f);
        int n = sc.nextInt();
        double area = Math.PI * Math.pow(n, 2);
        System.out.println(n);
        System.out.printf("%.2f\n", area);
    }
}
