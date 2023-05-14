package Collection.Box;

import java.util.List;

public class BoxDemo {
    public static void main(String[] args) {
        List<HeavyBox> startList = BoxCreator.create(10);
        printInfo("Start HeavyBox List before sorting", startList);
        List<HeavyBox> newList = BoxSorted.sort(startList, 300);
        printInfo("Start HeavyBox List after sorting", startList);
        printInfo("New HeavyBox List after sorting", newList);

    }

    public static void printInfo(String description, List<? extends Box> boxes) {
        System.out.println(description + " include " + boxes.size() + " boxes: ");
        for (Box box : boxes) {
            System.out.println(box);
        }
        System.out.println();
    }
}
