package Company;

import Company.Details.Engine;
import Company.Professions.Driver;
import Company.Vehicles.Car;

public class SportCar extends Car {
    private double speed;

    public SportCar(String mark, String clasAuto,
                    double weight, Driver driver, Engine engine, double speed) {
        super(mark, clasAuto, weight, driver, engine);
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "speed=" + speed +
                '}' + super.toString();
    }
}
