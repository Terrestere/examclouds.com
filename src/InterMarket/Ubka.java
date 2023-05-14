package InterMarket;

public class Ubka extends Cloth implements WomanCloth {

    public Ubka(Size size, String color) {
        super(size, color);
    }

    public Ubka(Size size, double stoim, String color) {
        super(size, stoim, color);
    }

    @Override
    public String toString() {
        return  "Юбка{" +
                "размер = " + getSize() +
                ", цена = " + getStoim() + " денег" +
                ", цвет = " + getColor() +
                "}";
    }
}
