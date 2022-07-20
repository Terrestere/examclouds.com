package Company;

import Company.Details.Engine;
import Company.Professions.Driver;
import Company.Vehicles.Car;

public class Lorry extends Car {
    private int carrying;

    public Lorry(String mark, String clasAuto,
                 double weight, Driver driver, Engine engine, int carrying) {
        super(mark, clasAuto, weight, driver, engine);
        this.carrying = carrying;
    }

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "carrying=" + carrying +
                '}' + super.toString();
    }
}
