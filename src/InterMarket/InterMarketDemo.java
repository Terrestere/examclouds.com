package InterMarket;



public class InterMarketDemo {
    public static void main(String[] args) {
        Tshirts tshirts = new Tshirts(Size.XS, 40,"red");
        Shtani shtani = new Shtani(Size.S, 80, "Yellow");
        Galstyk galstyk = new Galstyk(Size.L, 47,"Dark" );
        Galstyk galstyk1 = new Galstyk(Size.M, 60,"Dark green" );
        Ubka ubka = new Ubka(Size.XXS, 20, "Blue");
        Ubka ubka1 = new Ubka(Size.S, 35, "Green");

        Cloth[] cloth = {tshirts, shtani, galstyk, galstyk1, ubka, ubka1 };
        Atelie atelie = new Atelie();
        atelie.DressMale(cloth);
        System.out.println();
        atelie.DressFemale(cloth);

    }

}
