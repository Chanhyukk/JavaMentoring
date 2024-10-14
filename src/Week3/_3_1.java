package Week3;

public class _3_1 {
    public static void main(String[] args) {
        Computer computer = new Computer("m1");
        Monitor monitor = new Monitor(27);
        PersonalComputer pc = new PersonalComputer(computer, monitor);
        pc.turnOn();
        pc.printSpec();
        pc.turnOn();
    }
}
