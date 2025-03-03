package hwk_42.Task_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Author Waldemar Ilz
 * {code data} 03.03.2025
 */

/*
Task 3
Имеется список целых чисел.

Необходимо отфильтровать этот список, оставив только чётные числа, затем каждое число
 умножить на 2, и собрать результат в новый список
 */

public class FilteredListOfNumbers {
    public static void main(String[] args) {
        //Имеется список целых чисел
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50);
        // отфильтровать список и умножить на 2
        List<Integer> result = numbers.stream()
                .filter(n -> n % 2 == 0) // отфильтровать список оставляем только четные числа
                .map(n -> n * 2)// умножить каждое чётное число на 2
                .collect(Collectors.toList());// собрать результат в новый список
        // вывести результат
        System.out.println(result);

    }




}
