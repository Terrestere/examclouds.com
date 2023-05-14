package Animal;

public class Cat extends Animal {
    private int vozrast;

    public Cat(String food, String location, int vozrast) {
        super(food, location);
        this.vozrast = vozrast;
    }

    @Override
    public void makeNoise() {
        System.out.println("Cat make noise");
    }

    @Override
    public void eat() {
        System.out.println("Cat eating");
    }
}
