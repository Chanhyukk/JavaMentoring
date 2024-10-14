package Week3;

public class Monitor {
    private final int size;
    private boolean power;
    public Monitor(int size) {
        this.size = size;
    }
    public int getSize() {
        return size;
    }
    public boolean powerButton() {
        if (power == false) {
            power = true;
        } else {
            power = false;
        }
        return power;
    }
}
