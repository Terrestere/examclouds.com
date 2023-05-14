package Collection;

import java.util.*;

public class Naborchisel {

    static <E> List<E> noDuplicate (E[] array) {
        List<E> list = new ArrayList<>();
        Map<E, E> map = new HashMap<>();
        for (E arr : array) {
            map.put(arr, arr);
            System.out.println(map);
        }

        Set<Map.Entry<E, E>> set = map.entrySet();
        for (Map.Entry<E, E> st : set) {
            list.add(st.getKey());
        }
        return list;
    }

    static List<String> noDuplicate(String value) {
        String text = value;
        text = text.replace(" ", "");
        String[] arrayString = text.split(",");

        return Naborchisel.noDuplicate(arrayString);
    }

    public static void main(String[] args) {
        Integer[] arrayInt = {0, 1, 2, 9, 2, 8, 3, 7, 4, 6, 5, 5, 6, 4, 7, 3, 8, 2, 9, 1, 0};
        List<Integer> listInt = Naborchisel.noDuplicate(arrayInt);

        System.out.println(Arrays.toString(arrayInt));
        System.out.println(Arrays.toString(listInt.toArray()));
        System.out.println("The number of repetitions = " + (arrayInt.length - listInt.size()));

        System.out.println();

        /*System.out.println("Enter a set of numbers:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        List<String> listString = Naborchisel.noDuplicate(text);

        System.out.println(text);
        System.out.println(Arrays.toString(listString.toArray()));*/
    }
}
