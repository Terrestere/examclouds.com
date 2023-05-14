package Lambda;

import OOP.Phone;

import java.util.function.Consumer;

public class MainConsume {
    public static void main(String[] args) {
        Consumer<Phone> consumer1 = phone -> System.out.println("Sold telephone " + phone);
        Consumer<Phone> consumer2 = phone -> System.out.println("Send telephone " + phone);

        consumer1.accept(new Phone("892111911", "Samsung", 7));
        consumer1.andThen(consumer2).accept(new Phone("789754615", "samsa", 9));
    }
}
