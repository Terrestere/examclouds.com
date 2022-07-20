package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

import java.util.Scanner;

public class Car {
    public static void main(String[] args) {
        /*Engine engine = new Engine();
        Driver driver = new Driver();
        Driver.Driver();
        Engine.Engine();*/
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        if (scanner.hasNextInt()) {
            if (s > 10) {
                System.out.println("Положительное число больше 10 или отрицательное");
            } else {
                System.out.println("Положительное число меньше 10 или ноль");
            }
        }
    }
}
