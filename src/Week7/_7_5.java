package Week7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _7_5 {
    public static void main(String[] args) {
        ArrayList<String> sArr = new ArrayList<>();
        sArr.add("Jeong");
        sArr.add("Chan");
        sArr.add("Hyuk");
        for (String s : sArr) {
            System.out.println(s);
        }
        System.out.println(sArr);
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        for (Integer i : arr) {
            System.out.println(i);
        }
        System.out.println(arr);
        ArrayList<Character> charArr = new ArrayList<>();
        charArr.add('a');
        charArr.add('b');
        charArr.add('c');
        for (Character c : charArr) {
            System.out.println(c);
        }
        System.out.println(charArr);
        Integer[] i = {1,2,3,4,5,6,7,8,9};
        List<Integer> l = Arrays.asList(i); // Integer array -> List(Integer)
        System.out.println(l);
        Integer[] iii = new Integer[l.size()]; // List -> Integer Array
        iii = l.toArray(iii);
        ArrayList<Integer> ii = new ArrayList<>(l);
        // List(Integer) -> ArrayList(Integer)
        System.out.println(ii);
        // List는 add() 사용 불가능. 못 자란 아이들이라 생각하면 됨

    }
}
