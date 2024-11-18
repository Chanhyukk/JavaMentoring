package Week7;

import java.util.ArrayList;

public class _7_7 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < 101; i++) {
            if (i % 4 == 0 && i % 5 != 0) {
                list.add(i);
            }
        }
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        System.out.println(sum);
        sum = 0;
        for (int i: list) {
            sum += i;
        }
        System.out.println(sum);
    }
}
