package Week7;

public class AirportTemp {
    private String name;
    private int temp;
    public AirportTemp(String name, int temp) {
        this.name = name;
        this.temp = temp;
    }
    public String toString() {
        return name + " : " + temp;
    }
}
