package hwk_36.Task_1;

/**
 * Author Waldemar Ilz
 * {code data} 06.02.2025
 */

import java.util.Arrays;
import java.util.Comparator;

public class SportsmanApp {
    public static void main(String[] args) {


        Sportsman[] sportsman = new Sportsman[5];
        sportsman[0] = new Sportsman("Waldemar ", 44, 600);
        sportsman[1] = new Sportsman("Stefan", 48, 550);
        sportsman[2] = new Sportsman("Igor", 35, 700);
        sportsman[3] = new Sportsman("Edward", 55, 800);
        sportsman[4] = new Sportsman("Sergey Bugaenko", 100, 1000);

        System.out.println(Arrays.toString(sportsman));

        // Сортировка по возрасту с использованием Comparable
        System.out.println("\nСортировка по возрасту с использованием Comparable: \n");
        Arrays.sort(sportsman);
        System.out.println(Arrays.toString(sportsman));

        // Сортировка по естественному порядку (по имени)
        Arrays.sort(sportsman);
        System.out.println("\nСортировка по имени по естественному порядку:\n");
        for (Sportsman s : sportsman) {
            System.out.println(s);
        }

        // Сортировка по рейтингу с использованием Comparator
        Arrays.sort(sportsman, new ScoreSportsmanComparator());
        System.out.println("\nСортировка по рейтингу с использованием Comparator:\n");
        for (Sportsman s : sportsman) {
            System.out.println(s);
        }

        // Сортировка по возрасту с использованием анонимного класса
        Arrays.sort(sportsman, new Comparator<Sportsman>() {
            @Override
            public int compare(Sportsman s1, Sportsman s2) {
                return Integer.compare(s1.getAge(), s2.getAge()); // Сравнение по возрасту
            }
        });
        System.out.println("\nСортировка по возрасту с использованием анонимного класса:\n");
        for (Sportsman s : sportsman) {
            System.out.println(s);
        }
    }


}


