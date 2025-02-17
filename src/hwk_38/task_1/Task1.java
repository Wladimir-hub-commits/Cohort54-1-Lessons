package hwk_38.task_1;

import java.util.Arrays;
import java.util.List;

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

        String testStr = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";
        System.out.println("\nЗаменяем все НЕ буквы на пустоту:");
        String newStr = testStr.replaceAll("[^a-zA-Z0-9а-яА-Я ]", "");
        System.out.println(newStr);

        System.out.println("\nПреобразования строки в массив слов:");

        String[] words = newStr.split(" ");
        System.out.println(Arrays.toString(words));

        System.out.println("\nполучение массив строк в коллекцию:");

        List<String> list = Arrays.asList(words);
        System.out.println(list);

        System.out.println("\nудаление повторяющихся слов:");

        list = list.stream().distinct().sorted().toList();
        System.out.println(list);

        System.out.println("\nСортировка в порядке увеличения длин слов:");

        list = list.stream().sorted((s1, s2) -> s1.length() - s2.length()).toList();
        System.out.println(list);

    }
}
