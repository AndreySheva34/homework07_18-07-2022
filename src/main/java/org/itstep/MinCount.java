package org.itstep;

import java.util.Scanner;

public class MinCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Вводите после стрелки числа. Для завершения ввода введите ноль.");
        System.out.print(">");
        int count = scanner.nextInt();
        int minCount = count;

        while (count != 0){
            System.out.print(">");
            count = scanner.nextInt();
            minCount = (count != 0 && minCount > count) ? count : minCount;
        };

        System.out.println("Минимальное число: " + minCount);
    }
}
