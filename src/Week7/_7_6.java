package Week7;

import java.util.ArrayList;
import java.util.Iterator;

public class _7_6 {
    public static void main(String[] args) {
        ArrayList<String> airports = new ArrayList<>();
        airports.add("Alaska");
        airports.add("Bangalore");
        airports.add("Bangladesh");
        Iterator<String> iterator = airports.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
