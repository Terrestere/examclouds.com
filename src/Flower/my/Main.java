package Flower.my;

public class Main {
    public static void main(String[] args) {

        Flower[] flower = new Flower[3];
        flower[0] = new Rose("Obsh", 7, 72.1);
        flower[1] = new Tulpan("Narod", 5, 62.4);
        flower[2] = new Gvozdika("Teplo", 6, 56.3);

        Flower[] flower1 = new Flower[3];
        flower[0] = new Tulpan("Meto", 5, 67.5);
        flower[1] = new Romashka("Obsh", 3, 35.4);
        flower[2] = new Rose("Savun", 6, 79.3);

        Flower[] flower2 = new Flower[3];
        flower[0] = new Romashka("Obsh", 3, 35.4);
        flower[1] = new Rose("Narod", 5, 62.4);
        flower[2] = new Gvozdika("Teplo", 6, 56.3);


    }
}
