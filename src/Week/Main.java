package Week;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        switch (x) {

            case 1: {
                System.out.println("Mon");
                break;
            }
            case 2:
                System.out.println("Tu");
                break;
            case 3 :
                System.out.println("We");
                break;
            case 4:
                System.out.println("Th");
                break;
            case 5:
                System.out.println("Fr");
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}
