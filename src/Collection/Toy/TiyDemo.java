package Collection.Toy;

import java.util.HashMap;
import java.util.Map;

public class TiyDemo {
    public static void main(String[] args) {
        Map<String, Toy> toyMap = new HashMap<>();
        fillMap(toyMap);
        System.out.println("KeySet: ");
        MapIterator.printKeySet(toyMap);
        System.out.println("Values: ");
        MapIterator.printByValuses(toyMap);
        System.out.println("EntrySet ");
        MapIterator.printByEntrySet(toyMap);
    }

    public static void fillMap (Map<String, Toy> toyMap) {
        toyMap.put("Monster track", new Toy("Monster track", 250));
        toyMap.put("Teddy bear", new Toy("Teddy bear", 1250));
        toyMap.put("Machine gun", new Toy("Machine gun", 700));
        toyMap.put("Candy", new Toy("Candy", 10));
        toyMap.put("Angry bird", new Toy("Angry bird", 1000));
    }
}
