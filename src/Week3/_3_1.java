package Week3;

public class _3_1 {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Monitor monitor = new Monitor(27);
        PersonalComputer pc = new PersonalComputer(computer, monitor);
        pc.turnOn();
        pc.printSpec();
    }
}
