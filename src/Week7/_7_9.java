package Week7;

import java.util.*;
import java.io.*;

public class _7_9 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("./src/Week7/alice.txt"));
        Map<Character, Integer> map = new HashMap<>();
        while (sc.hasNext()) {
            for (char ch : sc.next().toCharArray()) {
                if (!map.containsKey(ch)) {
                    map.put(ch, 1);
                }
                map.put(ch, map.get(ch) + 1);
            }
        }
        for (char i = 'A'; i <= 'Z'; i++) {
            if (map.containsKey(i)) {
                System.out.println(i + ": " + map.get(i));
            }
        }
        for (char i = 'a'; i <= 'z'; i++) {
            if (map.containsKey(i)) {
                System.out.println(i + ": " + map.get(i));
            }
        }
    }
}
