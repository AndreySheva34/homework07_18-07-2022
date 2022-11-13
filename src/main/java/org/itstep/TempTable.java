package org.itstep;

import java.util.Scanner;

public class TempTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("t1 –> ");
        float t1 = scanner.nextFloat();
        System.out.print("t2 –> ");
        float t2 = scanner.nextFloat();
        System.out.print("dt –> ");
        float dt = scanner.nextFloat();
        System.out.println("-----------------");
        System.out.printf("%-7s %-7s %n","C","F");
        System.out.println("-----------------");
        for (float i = t1; i <= t2; i += dt) {
            float tf = 9f/5f * i + 32;
            System.out.printf("%-7.2f %-7.2f %n", i, tf);
        }
        System.out.println("-----------------");
    }
}
