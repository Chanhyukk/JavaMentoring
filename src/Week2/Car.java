package Week2;

public class Car {
    private int gas;
    private String carName;
    public Car () {

    }
    public Car (String carName) {
        setCarName(carName);
    }
    public Car (int gas) {
        setGas(gas);
    }
    public Car (String carName, int gas) {
        setCarName(carName);
        setGas(gas);
    }
    void setGas (int gas) {
        this.gas = gas;
    }
    int getGas () {
        return gas;
    }
    void setCarName (String carName) {
        this.carName = carName;
    }
    String getCarName () {
        return carName;
    }
    int move (int gas) {
        if (this.gas >= gas) {
            setGas(this.gas - gas);
            System.out.println(getCarName() + " move, remain gas: " + getGas());
            return gas;
        } else {
            setGas(this.gas);
            System.out.println(getCarName() + " out of fuel, remain gas: " + getGas());
            return this.gas - gas;
        }

    }
    int refuel (int amount) {
        setGas(gas + amount);
        System.out.println("fuel amount: " + amount + ", resume fuel: " + getGas());
        return amount;
    }
}
