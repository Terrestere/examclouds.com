package Instrument;

import java.util.Objects;

public class Drum implements Instrument{
    private String razmer;

    public Drum(String razmer) {
        this.razmer = razmer;
    }

    public String getRazmer() {
        return razmer;
    }

    public void setRazmer(String razmer) {
        this.razmer = razmer;
    }

    @Override
    public void play() {
        System.out.println("Playing drum" +", " + "razmer " + razmer);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drum drum = (Drum) o;
        return Objects.equals(razmer, drum.razmer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(razmer);
    }

    @Override
    public String toString() {
        return "Drum{" +
                "razmer='" + razmer + '\'' +
                '}';
    }
}
