package Company.Vehicles;

import Company.Details.Engine;
import Company.Professions.Driver;

public class Car {
    private String mark;
    private String clasAuto;
    private double weight;
    private Driver driver;
    private Engine engine;

    public Car(String mark, String clasAuto, double weight, Driver driver, Engine engine) {
        this.mark = mark;
        this.clasAuto = clasAuto;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public void start() {
        System.out.println("Start");
    }

    public void stop() {
        System.out.println("Stop");
    }

    public void turnRight() {
        System.out.println("Turn right");
    }

    public void turnLeft() {
        System.out.println("Turn left");
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getClasAuto() {
        return clasAuto;
    }

    public void setClasAuto(String clasAuto) {
        this.clasAuto = clasAuto;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", clasAuto='" + clasAuto + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }
}
