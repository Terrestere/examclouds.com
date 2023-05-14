package Animal;

public class Horse extends Animal {
    private String vid;

    public Horse() {
    }

    public Horse(String food, String location, String vid) {
        super(food, location);
        this.vid = vid;
    }

    @Override
    public void makeNoise() {
        System.out.println("Horse make noise");
    }

    @Override
    public void eat() {
        System.out.println("Horse eating");
    }
}
