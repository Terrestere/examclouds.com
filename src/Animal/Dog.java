package Animal;

public class Dog extends  Animal{
    private String pol;

    public Dog() {
    }

    public Dog(String food, String location, String pol) {
        super(food, location);
        this.pol = pol;
    }

    @Override
    public void makeNoise() {
        System.out.println("Dog make noise");
    }

    @Override
    public void eat() {
        System.out.println("Dog eating");
    }

}
