package InterMarket;

public class Atelie implements WomanCloth, ManCloth {

    public void DressMale(Cloth[] cloth){
        System.out.println("Male:");
        for (Cloth cloths : cloth) {
            System.out.println(cloths);
        }
    }

    public void DressFemale(Cloth[] cloth) {
        System.out.println("Female:");
        for (Cloth cloths : cloth) {
            System.out.println(cloths);
        }
    }
}
