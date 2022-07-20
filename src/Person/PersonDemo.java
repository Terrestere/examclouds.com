package Person;

public class PersonDemo {
    public static void main(String[] args) {
        Person person = new Person();
        Person person1 = new Person("Oled", 32);

        person1.move(person1.getFullName());
        person1.talk(person1.getFullName());
    }
}
