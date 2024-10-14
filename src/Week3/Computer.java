package Week3;

public class Computer {
    private final String cpu;
    private boolean power;
    public Computer(String cpu) {
        this.cpu = cpu;
    }
    public boolean powerButton() {
        if (power == false) {
            power = true;
        } else {
            power = false;
        }
        return power;
    }
    public String getCpu() {
        return cpu;
    }
}