package Week3;

public class Computer {
    private final String cpu;
    private boolean power;
    public Computer(String cpu) {
        this.cpu = cpu;
    }
    public boolean powerButton() {
        power = true;
        return power;
    }
    public String getCpu() {
        return cpu;
    }
}