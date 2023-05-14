package Instrument;

import java.util.Objects;

public class Guitar implements Instrument{
    private int strun;

    @Override
    public void play() {
        System.out.println("Playing guitar" + ", " + "strun " + strun);
    }

    public Guitar(int strun) {
        this.strun = strun;
    }

    public int getStrun() {
        return strun;
    }

    public void setStrun(int strun) {
        this.strun = strun;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Guitar guitar = (Guitar) o;
        return strun == guitar.strun;
    }

    @Override
    public int hashCode() {
        return Objects.hash(strun);
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "strun=" + strun +
                '}';
    }
}
