package Animal;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Animal[] animal = new Animal[3];
        animal[0] = new Cat("Minte", "Home", 6);
        animal[1] = new Dog("Bone", "Village", "Female");
        animal[2] = new Horse("Seno", "Ambar", "Skakun");
        Veterinar veterinar = new Veterinar();
        for (Animal z : animal) {
            veterinar.treatAnimmal(z);
        }
    }
}
