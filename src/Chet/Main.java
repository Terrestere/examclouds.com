package Chet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
            if (i % 2 == 0) {
                System.out.println("Четное число" + i);
            } else {
                System.out.println("Нечетное число");
            }
    }
}
