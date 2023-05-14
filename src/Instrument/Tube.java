package Instrument;

import java.util.Objects;

public class Tube implements Instrument {
    private double diametr;

    public Tube(double diametr) {
        this.diametr = diametr;
    }

    public double getDiametr() {
        return diametr;
    }

    public void setDiametr(double diametr) {
        this.diametr = diametr;
    }

    @Override
    public void play() {
        System.out.println("Playing tube" + ", " + "diametr " + diametr);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tube tube = (Tube) o;
        return Double.compare(tube.diametr, diametr) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(diametr);
    }

    @Override
    public String toString() {
        return "Tube{" +
                "diametr=" + diametr +
                '}';
    }
}
