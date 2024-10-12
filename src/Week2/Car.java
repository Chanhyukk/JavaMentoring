package Week2;

public class Car {
    private int gas;
    private String carName;
    Car () {

    }
    Car (String carName) {
        setCarName(carName);
    }
    Car (int gas) {
        setGas(gas);
    }
    Car (String carName, int gas) {
        setCarName(carName);
        setGas(gas);
    }
    public void setGas (int gas) {
        this.gas = gas;
    }
    public int getGas () {
        return gas;
    }
    public void setCarName (String carName) {
        this.carName = carName;
    }
    public String getCarName () {
        return carName;
    }
    public int move (int gas) {
        if (this.gas >= gas) {
            setGas(this.gas - gas);
            System.out.println(getCarName() + " move, remain gas: " + getGas());
            return getGas();
        } else {
            setGas(this.gas);
            System.out.println(getCarName() + " out of fuel, remain gas: " + getGas());
            return getGas() - gas;
        }

    }
    public int refuel (int amount) {
        setGas(gas + amount);
        System.out.println("fuel amount: " + amount + ", resume fuel: " + getGas());
        return amount;
    }
}
