package Animal;

public class Veterinar {
    void treatAnimmal(Animal animal) {
        System.out.println("Animal on vetclinic: " + animal.toString());
        System.out.print("Food " + animal.getFood() + ".");
        System.out.print(" Location " + animal.getLocation() + "." + '\n');

    }
}
