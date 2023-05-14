package FormatirovanieStrok;

import java.util.Formatter;

public class Main {
    public static void main(String[] args) {
        print("Ivan", 5, "Math");
        print("Daria", 3, "Phis");
    }

    private static void print(String fullName, int mark, String subject) {
        Formatter formatter = new Formatter();
        formatter.format("Студент %-15s получил %-3s по %-10s", fullName, mark, subject);
        System.out.println(formatter);
    }
}
