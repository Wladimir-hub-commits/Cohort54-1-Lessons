package hwk_38.task_1;

import java.util.*;

/**
 * Author Waldemar Ilz
 * {code data} 15.02.2025
 */

/*
Напишите метод, принимающий строку и возвращающий Список ее слов без повторений, отсортированный в порядке увеличения длин слов.

Если строки имеют одинаковую длину - сортировать в естественном порядке

public static void main(String[] args) {
        String testString = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";
        System.out.println(StringUtil.getUniqueSortedWords(testString));
    }
Copy
// Output:
[для, слов, строка, которые, Тестовая, удаления, повторяются]
 */
public class Task1 {

    public static void main(String[] args) {


        String testString = "Тестовая строка для     удаления слов, которые повторяются. \"строка\" для удаления!";
        System.out.println(getUniqueSortedWords(testString));
    }

    private static List<String> getUniqueSortedWords(String string) {
        /*
        1. Избавиться от знаков препинания
        2. Разбить на слова (массив слов / список сло)
        3. Поместить в коллекцию, которая обеспечит уникальность и сортировку (SortedSet)
        4. Преобразовать результат в список и вернуть
         */

        // "    "


        // regex - s - Специальный знак обозначающий "пробельный символ" - пробел, табуляция, перевод каретки \r, перевод строки \n
        // s+ - пробельный символ в колве 1 или больше
        // массив слов, состоящих только из букв и цифр (без знаков пунктуации)
        String[] words = string.replaceAll("[^a-zA-Zа-яА-Я0-9 ]", "").split("\\s+");
//        System.out.println("words: " + Arrays.toString(words));

        Set<String> uniqueWords = new TreeSet<>(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder()));

        // Arrays.asList(T[] array) - преобразует массив в список
//        List<String> wordsList = Arrays.asList(words);
        uniqueWords.addAll(Arrays.asList(words));


        return new ArrayList<>(uniqueWords);

        // Моя реализация домашнего задания
//        String testStr = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";
//        System.out.println("\nЗаменяем все НЕ буквы на пустоту:");
//        String newStr = testStr.replaceAll("[^a-zA-Z0-9а-яА-Я ]", "");
//        System.out.println(newStr);
//
//        System.out.println("\nПреобразования строки в массив слов:");
//
//        String[] words = newStr.split(" ");
//        System.out.println(Arrays.toString(words));
//
//        System.out.println("\nполучение массив строк в коллекцию:");
//
//        List<String> list = Arrays.asList(words);
//        System.out.println(list);
//
//        System.out.println("\nудаление повторяющихся слов:");
//
//        list = list.stream().distinct().sorted().toList();
//        System.out.println(list);
//
//        System.out.println("\nСортировка в порядке увеличения длин слов:");
//
//        list = list.stream().sorted((s1, s2) -> s1.length() - s2.length()).toList();
//        System.out.println(list);

    }
}
