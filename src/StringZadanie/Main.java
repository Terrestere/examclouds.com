package StringZadanie;

public class Main {
    public static void main(String[] args) {
    compareStr("I love Java!!!");
    compareStr("I love Python!!!");
    compareStr("I hate C++!!!");

    }

    public static void compareStr(String str) {
        System.out.println(str);
        System.out.println(str.endsWith("!!!"));
        System.out.println(str.charAt(str.length()-1));
        System.out.println(str.startsWith("I love"));
        System.out.println(str.contains("Java"));
        System.out.println(str.indexOf("Java"));
        System.out.println(str.replace("a", "o"));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
//        System.out.println(str.substring(str.indexOf("Java"), str.indexOf("Java")+4));
        System.out.println();
    }
}
