package Collection;

import OOP.Phone;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();

        phones.add(new Phone("08888878", "iphone", 45));
        phones.add(new Phone("082138", "nokia", 425));
        phones.add(new Phone("412314123", "samsung", 15));

        System.out.println(phones);

        for (Phone phone : phones) {
            System.out.println(phone.getNumber());

        }

        System.out.println();
        phones.forEach(p -> System.out.println(p.getModel()));
    }
}
