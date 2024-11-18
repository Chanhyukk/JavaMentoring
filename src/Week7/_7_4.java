package Week7;

import java.util.Scanner;

public class _7_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb1.append(s.charAt(s.length() - 1 - i));
        }
        System.out.println(sb1);
        StringBuilder sb2 = new StringBuilder();
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            sb2.append(c[c.length - 1 - i]);
        }
        System.out.println(sb2);
    }
}
