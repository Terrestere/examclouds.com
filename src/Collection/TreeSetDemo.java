package Collection;

import OOP.Phone;
import Person.Person;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Comparator<Person> personComparator =
                (Person o1, Person o2) -> o1.getFullName().compareTo(o2.getFullName());

        /*new Comparator<Person> () {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getFullName().compareTo(o2.getFullName());
            }
        };*/
        SortedSet<Person> persons = new TreeSet<>(personComparator);
        SortedSet<Phone> phones = new TreeSet<>();
        phones.add(new Phone("3015648786", "iphone", 45.5));
        phones.add(new Phone("1421321321", "samsung", 45.7));
        phones.add(new Phone("1422132456", "nokia", 2));

        phones.forEach(System.out::println);


        persons.add(new Person("Das", 21, false));
        persons.add(new Person("Axz", 14, true));
        persons.add(new Person("Cas", 32, true));
        persons.add(new Person("Cas", 44, false));

        persons.forEach(System.out::println);
    }
}
