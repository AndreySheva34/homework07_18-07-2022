package org.itstep;

import java.util.Random;
import java.util.Scanner;

public class Subtract {
    public static void main( String[] args ){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < 10; i++) {
            int minuend = random.nextInt(100);
            int subtrahend = random.nextInt(100);;

            while(minuend < subtrahend){
                subtrahend = random.nextInt(100);
            }

            System.out.print(minuend + "-" + subtrahend + "=");
            int value = scanner.nextInt();

            if(minuend-subtrahend == value){
                count++;
            }else {
                System.out.print("Вы ошиблись! ");
            }
        }

        System.out.println("Правильных ответов: " + count);
        System.out.print("Оценка: ");

        if(count == 10){
            System.out.println("отлично");
        } else if (count == 9 || count == 8) {
            System.out.println("хорошо");
        }
        else if (count == 7 || count == 6) {
            System.out.println("удовлетворительно");
        } else {
            System.out.println("плохо");
        }

    }
}
