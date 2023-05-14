package Lambda;

import java.util.function.Predicate;

public class MainPredicate {
    public static void main(String[] args) {
        Predicate<String> predicate1 = s ->s != null;
        Predicate<String> predicate2 = s -> !s.isEmpty();

        Predicate<String> predicate3 = predicate1.and(predicate2);

        System.out.println(predicate3.test(null));
        System.out.println(predicate3.test(""));
        System.out.println(predicate3.test("someString"));

        System.out.println(predicate1.test(null));
        System.out.println(predicate1.test(""));
        System.out.println(predicate1.test("someString"));
        System.out.println(predicate2.test(""));
        System.out.println(predicate2.test("someString"));

        Predicate<String> predicate4 = s -> s.startsWith("J");
        Predicate<String> predicate5 = s -> s.startsWith("N");
        Predicate<String> predicate6 = s -> s.endsWith("A");

        Predicate<String> predicate66 = predicate4.or(predicate5).and(predicate6);
        System.out.println(predicate66.test("Java"));
        System.out.println(predicate66.test("JavA"));
        System.out.println(predicate66.test("Net"));
    }
}
