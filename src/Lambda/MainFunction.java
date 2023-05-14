package Lambda;

import java.util.function.Function;
import java.util.function.IntFunction;

public class MainFunction {
    public static void main(String[] args) {
        Function<Integer,String> function1 = i -> {
            String result = "Zero";
            if (i > 0) {
                result = "Positive digital";
            } else if (i < 0) {
                result = "Negative digital";
            }
            return result;
        };

        System.out.println(function1.apply(-9));
        System.out.println(function1.apply(99));
        System.out.println(function1.apply(0));

        IntFunction<String> function2 = String::valueOf;
        System.out.println(function2.apply(450));
    }
}
