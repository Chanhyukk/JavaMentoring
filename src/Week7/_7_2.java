package Week7;

public class _7_2 {
    public static void main(String[] args) {
        String[] names = {"INC", "JFK", "NRT", "LHR"};
        int[] temp = {5,10,12, 14};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " : " + temp[i]);
        }
        System.out.println();
        AirportTemp[] a = new AirportTemp[temp.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = new AirportTemp(names[i], temp[i]);
        }
        for (AirportTemp airportTemp : a) {
            System.out.println(airportTemp.toString());
        }
    }
}
