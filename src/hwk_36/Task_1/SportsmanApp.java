package hwk_36.Task_1;

/**
 * Author Waldemar Ilz
 * {code data} 06.02.2025
 */

import java.util.Arrays;
import java.util.Comparator;

public class SportsmanApp {
    public static void main(String[] args) {


        Sportsman[] sportsmanArray = new Sportsman[6];
        sportsmanArray[0] = new Sportsman("Waldemar ", 44, 60.38);
        sportsmanArray[1] = new Sportsman("Stefan", 48, 55.65);
        sportsmanArray[2] = new Sportsman("Igor", 35, 90.50);
        sportsmanArray[3] = new Sportsman("Edward", 55, 80.70);
        sportsmanArray[4] = new Sportsman("Sergey Bugaenko", 100, -1_600_000_000);
        sportsmanArray[5] = new Sportsman("Олег", 90, 1_400_000_000);

        Arrays.sort(sportsmanArray);
        // Распeчатка массива не в алфавитном порядке
        for (Sportsman sportsman : sportsmanArray) {
            System.out.println(sportsman);
        }
         // Распечатка массива по очкам/рейтингу
        System.out.println("==============================");
        Arrays.sort(sportsmanArray, new ScoreSportsmanComparator());
        for (Sportsman sportsman : sportsmanArray) {
            System.out.println(sportsman);

        }
        System.out.println((int) (90.75-90.50));
        System.out.println(Double.compare(90.75, 90.50));
        System.out.println("==============================\n");

        //* анонимного класса Comparator для сортировки по третьему полю (например, age).
        Arrays.sort(sportsmanArray, new Comparator<Sportsman>() {
            @Override
            public int compare(Sportsman s1, Sportsman s2) {
            // Сравниваем примитивы вычитанием - может произойти переполнение типа данных
                return s1.getAge() - s2.getAge();
            }
        });

        for (Sportsman sportsman : sportsmanArray) {
            System.out.println(sportsman);
        }

        int x1 = -1_500_000_000;
        int y2 = 1_400_000_000;
        System.out.println(x1 - y2);


//            // Сортировка по возрасту с использованием Comparable
//            System.out.println("\nСортировка по возрасту с использованием Comparable: \n");
//
//            Arrays.sort(sportsmanArray);
//            System.out.println(Arrays.toString(sportsmanArray));
//
//            // Сортировка по естественному порядку (по имени)
//            Arrays.sort(sportsmanArray);
//            System.out.println("\nСортировка по имени по естественному порядку:\n");
//            for (Sportsman s : sportsmanArray) {
//                System.out.println(s);
//            }
//
//            // Сортировка по рейтингу с использованием Comparator
//            Arrays.sort(sportsmanArray, new ScoreSportsmanComparator());
//            System.out.println("\nСортировка по рейтингу с использованием Comparator:\n");
//            for (Sportsman s : sportsmanArray) {
//                System.out.println(s);
//            }
//
//            // Сортировка по возрасту с использованием анонимного класса
//            Arrays.sort(sportsmanArray, new Comparator<Sportsman>() {
//                @Override
//                public int compare(Sportsman s1, Sportsman s2) {
//                    return Integer.compare(s1.getAge(), s2.getAge()); // Сравнение по возрасту
//                }
//            });
//            System.out.println("\nСортировка по возрасту с использованием анонимного класса:\n");
//            for (Sportsman s : sportsmanArray) {
//                System.out.println(s);
//            }
    }


}



