package Garland;


public class Main {
    public static void main(String[] args) {

        int q = 78;
        System.out.println(Integer.toBinaryString(78));
        blink(q);
        System.out.println();
        run(q);
        //isFirstLampOn(q);

    }

    static void blink(int q) {
        q = ~q;
        System.out.println(Integer.toBinaryString(q));
    }

    static void run(int q) {
        q = q >> 1;
        System.out.println(Integer.toBinaryString(q));
    }

    /*static void isFirstLampOn(int q) {

        long w = ;
        q = q & w;
        System.out.println(q);
    }*/
}
