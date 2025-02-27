package hwk_41.Task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Author Waldemar Ilz
 * {code data} 26.02.2025
 */

/*
Task 1
Напишите метод, принимающий список чисел и возвращающий новый, отфильтрованный список.

В новом списке должны быть только те числа из старого списка, которые соответствуют всем условиям: четные, больше 10 и меньше 100

Для фильтрации используйте Stream API
 */

public class AcceptorStringsMethod {
    public static void main(String[] args) {

        task01();

    }// Method area

    private static void task01() {

        // Получить список, содержащий все положительные числа из исходного списка
        List<Integer> integers = List.of(10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70);
        List<Integer> result = new ArrayList<>();// создание коллекции

        // Получить список, содержащий все положительные числа из исходного списка
        for (Integer num : integers) {// проход по коллекции
            if (num > 0) {// условие
                result.add(num);// добавление в коллекцию
            }
//        integers.stream().filter(num1 -> num % 2 == 0 && num > 10 && num < 100).forEach(result::add);
//
//        System.out.println(result);
        }

        result.sort(Comparator.naturalOrder());// сортировка
        System.out.println("result: " + result);// вывод

        System.out.println("\n===================\n");

        // У всех коллекций есть метод .stream() создающий поток (стрим) из элементов коллекции.
       List<Integer> integerList = integers.stream() // создание потока из элементов коллекции List
                .filter(num -> num % 2 == 0 && num > 10 && num < 100) // фильтрация элементов потока
                .sorted() // сортировка элементов в естественном порядке
                .collect(Collectors.toList()); // собирает элементы потока в коллекцию List

        System.out.println("integerList: " + integerList);// вывод

    }
}
