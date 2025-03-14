package hwk_41.Task2;

import java.util.ArrayList;
import java.util.List;

/**
 * Author Waldemar Ilz
 * {code data} 26.02.2025
 */


/*
Task 2
Дан список строк.

Используя Stream API, отфильтруйте строки, которые начинаются на определенную букву
(например, "A") и отсортируйте их в алфавитном порядке.

Результат сохраните в новый список строк.
 */

public class StringSortList {
    public static void main(String[] args) {

        List<String> strings = List.of("Avocado", "Banana", "Apple", "Orange", "Auto", "Grape", "Lemon", "Kiwi", "Pineapple", "Watermelon", "Strawberry", "Blueberry");

        List<String> result = strings.stream()// создание потока
                .filter(s -> s.startsWith("A"))// фильтрация
                .sorted() // сортировка
                .toList();// преобразование потока в список
        System.out.println(result);
    }



}
