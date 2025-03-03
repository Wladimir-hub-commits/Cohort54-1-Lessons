package hwk_42.Task_2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Author Waldemar Ilz
 * {code data} 02.03.2025
 */

/*
Task 2
Имеется список строк. Используя Stream API, найдите строку с минимальной длиной.
 */

public class SearchForStringWitMinimumLength {
    public static void main(String[] args) {

        // создание списка строк с помощью of
        List<String> strings = List.of("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten");
        System.out.println("========== Method reference ===========\n");
        // получить строку с минимальной длиной
        Optional<String> minLengthString = strings.stream() // создание потока
                .min((String s1, String s2) -> s1.length() - s2.length()); // сортировка по длине строк
        // вывод результата
        minLengthString.ifPresent(System.out::println);

        System.out.println("\n========== Stream API ===========\n");

        List<String> strings2 = Arrays.asList("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten");

        Optional<String> minLengthString2 = strings2.stream()
                .min((s1,s2) -> Integer.compare(s1.length(), s2.length())); // сортировка по длине строк

        minLengthString2.ifPresent(s -> System.out.println("Строка с минимальной длиной: " + s));





    }
}
