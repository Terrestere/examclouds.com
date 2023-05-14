package Djeneric;

public class Main {
    public static void main(String[] args) {
        Food omlet = new Food("Omlet");
        omlet.prepare(new Cookable() {
            @Override
            public void cook(String str) {
                System.out.println();
                System.out.println("Взбейте яйца миксером. Сначала на маленькой скорости, потом — на максимальной.\n");
            }
        }, "Omlet");
    }

}
