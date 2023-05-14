package Collection.Toy;

import java.util.Map;
import java.util.Set;

public class MapIterator {
    public static <K, V> void printKeySet(Map<K, V> map) {
        for (K key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
        System.out.println();
    }

    public static <K, V> void printByValuses (Map<K, V> map) {
        for (V valie : map.values()) {
            System.out.println(valie);
        }
        System.out.println();
    }

    public static <K, V> void printByEntrySet(Map<K, V> map) {
        Set<Map.Entry<K, V>> entrySet = map.entrySet();
        for (Map.Entry<K, V> entry : entrySet) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
