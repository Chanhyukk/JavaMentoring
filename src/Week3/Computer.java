package Week3;

public class Computer {
    private final String cpu = "CPU";
    private boolean power;
    public boolean powerButton() {
        power = true;
        return power;
    }
    public String getCpu() {
        return cpu;
    }
}