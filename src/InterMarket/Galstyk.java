package InterMarket;

public class Galstyk extends Cloth implements ManCloth {

    public Galstyk(Size size, String color) {
        super(size, color);
    }

    public Galstyk(Size size, double stoim, String color) {
        super(size, stoim, color);
    }

    @Override
    public String toString() {
        return  "Галстук{" +
                "размер = " + getSize() +
                ", цена = " + getStoim() + " денег" +
                ", цвет = " + getColor() +
                "}";
    }
}
