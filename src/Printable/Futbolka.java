package Printable;

import InterMarket.Cloth;
import InterMarket.ManCloth;
import InterMarket.Size;
import InterMarket.WomanCloth;

public class Futbolka extends Cloth implements ManCloth, WomanCloth {
    public Futbolka(Size size, String color) {
        super(size, color);
    }

    public Futbolka(Size size, double stoim, String color) {
        super(size, stoim, color);
    }
}
