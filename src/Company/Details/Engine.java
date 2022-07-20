package Company.Details;

public class Engine {
    private String power;
    private String brand;

    public Engine(String power, String brand) {
        this.power = power;
        this.brand = brand;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", brand='" + brand + '\'' +
                '}';
    }
}
