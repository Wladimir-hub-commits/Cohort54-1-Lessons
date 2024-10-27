package hwk_09;

/**
 * Author Waldemar Ilz
 *{code data} 15.10.2024
 */

/*

Task 5
Написать метод, который принимает массив строк. Вывести на экран
 все символы самой длинной строки из массива.

Пример:

{ "One", "Two", "Twenty" } ->

T
w
e
n
t
y
 */

public class Task_05 {
    public static void main(String[] args) {
        String[] inputArray = {"One", "Two", "Twenty"};
        printLongestStringCharacters(inputArray);
    }

    public static void printLongestStringCharacters(String[] strings) {
        if (strings == null || strings.length == 0) {
            System.out.println("Массив пустой.");
            return;
        }

        String longestString = strings[0];

        // Находим самую длинную строку
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
