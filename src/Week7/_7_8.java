package Week7;

import java.util.*;

public class _7_8 {
    public static void main(String[] args) {
        Map<String, String> m1 = new HashMap<>();
        m1.put("Windows", "2000");
        m1.put("Windows", "XP");
        m1.put("Language", "Java");
        m1.put("Website", "smu.ac.kr");
        m1.put("Computer", "11");
        System.out.println(m1);
        System.out.println();
        for (String s : m1.keySet()) {
            System.out.println(s + ": " + m1.get(s));
        }
        System.out.println();
        for (Map.Entry<String, String> map : m1.entrySet()) {
            System.out.println(map.getKey() + ": " + map.getValue());
        }
    }
}
