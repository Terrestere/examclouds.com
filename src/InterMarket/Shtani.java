package InterMarket;

public class Shtani extends Cloth implements ManCloth, WomanCloth {
    public Shtani(Size size, String color) {
        super(size, color);
    }

    public Shtani(Size size, double stoim, String color) {
        super(size, stoim, color);
    }

    @Override
    public String toString() {
        return  "Штаны{" +
                "размер = " + getSize() +
                ", цена = " + getStoim() + " денег" +
                ", цвет = " + getColor() +
                "}";
    }
}
