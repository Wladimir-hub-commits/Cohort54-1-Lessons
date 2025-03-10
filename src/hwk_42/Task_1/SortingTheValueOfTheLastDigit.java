package hwk_42.Task_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Author Waldemar Ilz
 * {code data} 01.03.2025
 */

/*
Task 1
Из списка целых чисел выделите те значения, которые больше 10; отсортируйте эти значения
по значению последней цифры в числе и выведите результат на экране
 */

public class SortingTheValueOfTheLastDigit {
    public static void main(String[] args) {

        // исходный список целых чисел
        List<Integer> numbers = List.of(3,5, 4, 14, 56, 32, 9,25, -15, -100, 100);
        System.out.println("\n====================anonymous class==============================\n");
        // Выделяем числа больше 10
        List<Integer> filteredNumbers = new ArrayList<>();
        // Перебираем исходный список
        for (Integer number : numbers){
            if (number > 10) {
                filteredNumbers.add(number);
            }
        }
        // Сортируем по последней цифре с помощью анонимного класса
        Collections.sort(filteredNumbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1 % 10, o2 % 10);
            }
        });
        // Выводим результат
        System.out.println("числа больше 10, отсортированные по последней цифре: ");
        for (Integer number : filteredNumbers) {
            System.out.print(number + " ");
        }

        System.out.println("\n==================== anonymous class==============================\n");

        // Сортируем по последней цифре с помощью анонимного класса
        Collections.sort(filteredNumbers, Comparator.comparingInt(n -> n % 10));
        // Выводим результат
        System.out.println("числа больше 10, отсортированные по последней цифре: ");
        for (Integer number : filteredNumbers) {
            System.out.print(number + " ");
        }

        System.out.println("\n====================lambda==============================\n");

        // Сортируем по последней цифре с помощью lambda
        filteredNumbers.sort((n1, n2) -> n1 % 10 - n2 % 10);

        // Выводим результат
        System.out.println("числа больше 10, отсортированные по последней цифре: " + filteredNumbers);

        System.out.println("\n=====================Stream API Declarative style=============================\n");

        // Сортируем по последней цифре с помощью stream (декларированный метод)
        List<Integer> result = filteredNumbers.stream()
                .filter(n -> n % 10 > 0)
                .sorted((n1,n2) -> Integer.compare(n1 % 10, n2 % 10))
                .collect(Collectors.toList());

        System.out.println("числа больше 10, отсортированные по последней цифре: " + result);

    }

}
