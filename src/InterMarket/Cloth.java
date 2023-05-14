package InterMarket;

import java.util.Objects;

public abstract class Cloth {
    private Size size;
    private double stoim;
    private String color;

    public Cloth(Size size, String color) {
        this.size = size;
        this.color = color;
    }

    public Cloth(Size size, double stoim, String color) {
        this.size = size;
        this.stoim = stoim;
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public double getStoim() {
        return stoim;
    }

    public void setStoim(double stoim) {
        this.stoim = stoim;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cloth cloth = (Cloth) o;
        return Double.compare(cloth.stoim, stoim) == 0 && size == cloth.size && Objects.equals(color, cloth.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, stoim, color);
    }

    @Override
    public String toString() {
        return "Cloth{" +
                "size=" + size +
                ", stoim=" + stoim +
                ", color='" + color + '\'' +
                '}';
    }
}
