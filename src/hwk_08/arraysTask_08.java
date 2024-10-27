package hwk_08;

/**
 * Author Waldemar Ilz
 *{code data} 10.10.2024
 */

/*
Task 8 * (Опционально)
Написать метод, который принимает массив строк. Вывести на экран все символы самой длинной строки из массива.

Пример:

{ "One", "Two", "Twenty" } ->

T
w
e
n
t
y
Copy



 */

public class arraysTask_08 {
    public static void main(String[] args) {
        String[] array = {"One", "Two", "Twenty"};
        printLongestStringCharacters(array);
    }

    public static void printLongestStringCharacters(String[] strings) {
        if (strings == null || strings.length == 0) {
            System.out.println("Массив строк пустой.");
            return;
        }

        String longestString = strings[0];

        // Ищем самую длинную строку
        for (String str : strings) {
            if (str.length() > longestString.length()) {
                longestString = str;
            }
        }

        // Выводим каждый символ самой длинной строки
        for (char c : longestString.toCharArray()) {
            System.out.println(c);
        }
    }
}
