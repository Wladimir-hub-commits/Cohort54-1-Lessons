package hwk_38.task_2;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Author Waldemar Ilz
 * {code data} 15.02.2025
 */

/*
1. Создайте два множества строк (Set<String>), каждое из которых будет заполнено
различными словами. Некоторые слова должны повторяться в обоих множествах.

2. Реализуйте метод union(Set<String> set1, Set<String> set2), который возвращает
множество, содержащее все уникальные элементы из обоих множеств (объединение множеств).

3. Реализуйте метод intersection(Set<String> set1, Set<String> set2),
который возвращает множество, содержащее только элементы, которые присутствуют
в обоих исходных множествах (пересечение множеств).

4. Реализуйте метод difference(Set<String> set1, Set<String> set2),
который возвращает множество элементов, которые есть в первом множестве,
 но отсутствуют во втором (разность множеств).

- Результат каждого метода необходимо выводить в консоль для наглядности.
- Следует обеспечить, чтобы в исходных множествах были как уникальные,
так и общие элементы для наглядности результатов операций.

Set<String> set1 = new HashSet<>(List.of("A", "B", "C", "D"));
Set<String> set2 = new HashSet<>(List.of("C", "D", "E", "F"));

System.out.println(SetUtils.union(set1, set2));
System.out.println(SetUtils.intersection(set1, set2));
System.out.println(SetUtils.difference(set1, set2));

// Output:
[A, B, C, D, E, F]
[C, D]
[A, B]
 */

public class Task2 {

    public static void main(String[] args) {

        Set<String> set1 = new HashSet<>(List.of("A", "B", "C", "D"));
        Set<String> set2 = new HashSet<>(List.of("C", "D", "E", "F"));

        System.out.println(union(set1, set2));
        System.out.println(intersection(set1, set2));
        System.out.println(difference(set1, set2));
    }

    private static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        // все уникальные элементы из обоих множеств (объединение множеств).
        Set<T> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }

    private static <T> Set<T> intersection(Set<T> set1, Set<T> set2) {
        // содержащее только элементы, которые присутствуют в обоих исходных множествах (пересечение множеств).
        Set<T> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }

    private static <T> Set<T> difference(Set<T> set1, Set<T> set2) {
        // множество элементов, которые есть в первом множестве, но отсутствуют во втором (разность множеств)
        Set<T> result = new HashSet<>(set1);
        result.removeAll(set2);
        return result;




//        // Создание и заполнение множеств
//        Set<String> set1 = new HashSet<>(List.of("A", "B", "C", "D"));//
//        Set<String> set2 = new HashSet<>(List.of("C", "D", "E", "F"));
//
//        System.out.println("Set 1: " + set1);
//        System.out.println("Set 2: " + set2);
//
//        Set<String> unionSet = union(set1, set2);// объединение
//        System.out.println("Union: " + unionSet);// объединение
//
//        Set<String> intersectionSet = intersection(set1, set2);// пересечение
//        System.out.println("Intersection: " + intersectionSet);// пересечение
//
//        Set<String> differenceSet = difference(set1, set2);// разность
//        System.out.println("Difference: " + differenceSet);// разность
//    }
//
//    // Метод объединения множеств
//    public static Set<String> union(Set<String> set1, Set<String> set2) {
//        Set<String> result = new HashSet<>(set1);// создание нового множества
//        result.addAll(set2);// добавление элементов из второго множества
//        return result;
//
//    }
//
//    // Метод пересечения множеств
//    public static Set<String> intersection(Set<String> set1, Set<String> set2) {
//        Set<String> result = new HashSet<>(set1);// создание нового множества
//        result.retainAll(set2);// сохранение элементов, которые есть во втором множестве
//        return result;
//    }
//
//    // Метод разности множеств
//    public static Set<String> difference(Set<String> set1, Set<String> set2) {
//        Set<String> result = new HashSet<>(set1);// создание нового множества
//        result.removeAll(set2);// удаление элементов, которые есть во втором множестве
//        return result;
    }
}