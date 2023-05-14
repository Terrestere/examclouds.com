package InterMarket;

public class Tshirts extends Cloth implements ManCloth, WomanCloth {
    public Tshirts(Size size, String color) {
        super(size, color);
    }

    public Tshirts(Size size, double stoim, String color) {
        super(size, stoim, color);
    }

    @Override
    public String toString() {
        return  "Футболка{" +
                "размер = " + getSize() +
                ", цена = " + getStoim() + " денег" +
                ", цвет = " + getColor() +
                "}";
    }
}
