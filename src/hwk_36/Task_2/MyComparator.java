package hwk_36.Task_2;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Author Waldemar Ilz
 * {code data} 10.02.2025
 */

/*
1. Напишите MyComparator, реализующий Comparator с методом сравнения для сортировки массива целых чисел в следующем порядке:

Четные целые числа должны идти перед нечетными числами
Integer[] integers = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };
// Сортировка массива с использованием компаратора
[2, 4, 6, 8, 1, 3, 5, 7, 7, 9] // Outpur

 */

public class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer a, Integer b) {
        // Если оба числа четные или оба нечетные, сортируем по значению
        if (a % 2 == b % 2) {
            return Integer.compare(a, b);
        }
        // Четные числа должны идти перед нечетными
        return (a % 2 == 0) ? -1 : 1;
    }

    public static void main(String[] args) {
        Integer[] integers = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };

        // Сортировка массива с использованием компаратора
        Arrays.sort(integers, new MyComparator());

        // Вывод отсортированного массива
        System.out.println(Arrays.toString(integers));
    }
}