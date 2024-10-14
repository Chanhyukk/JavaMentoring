package Week3;

public class PersonalComputer {
    private Computer computer;
    private Monitor monitor;
    public PersonalComputer(Computer computer, Monitor monitor) {
        this.computer = computer;
        this.monitor = monitor;
    }
    public void turnOn() {
        computer.powerButton();
        System.out.println("Computer turn on");
    }
    public void printSpec() {
        System.out.println("Size: " + monitor.getSize());
        System.out.println("CPU: " + computer.getCpu());
    }
}
