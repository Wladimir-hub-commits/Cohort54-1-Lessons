package hwk_41_2;

import lesson_28.persons.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Author Waldemar Ilz
 * {code data} 28.02.2025
 */
/*
Task 1
Напишите метод, принимающий список чисел и возвращающий новый, отфильтрованный список.

В новом списке должны быть только те числа из старого списка, которые соответствуют всем условиям:
- четные,
- больше 10 и
- меньше 100

Для фильтрации используйте Stream API

 */

    /*
    Task 2
Дан список строк.

Используя Stream API, отфильтруйте строки,
которые начинаются на определенную букву (например, "A") и отсортируйте их в алфавитном порядке.

Результат сохраните в новый список строк.
     */

    /*
    Task 3
    Используйте Stream API для фильтрации людей, которые старше определенного возраста и проживают в определенном городе, а затем соберите их в список.

Например, старше 25 лет и проживающих в городе "Berlin"
     */

public class Task_1_2_3 {

    public static void main(String[] args) {

        // Task 1
        List<String> strings = List.of("Avocado", "Banana", "Apple", "Orange", "Auto", "Grape", "Lemon", "Kiwi", "Pineapple", "Watermelon", "Strawberry", "Blueberry");
        System.out.println(filterStrings(strings));

        // Task 3
        List<Person2> people = new ArrayList<>(
                List.of(
                        new Person2("John", 20, "New York"),
                        new Person2("Alice", 25, "London"),
                        new Person2("Bob", 30, "Berlin"),
                        new Person2("Eva", 35, "Paris"),
                        new Person2("Charlie", 40, "Berlin"),
                        new Person2("David", 45, null)
                )
        );
        people.add(null);

        List<Person2> personList = people.stream()
                .filter(Objects::nonNull)
                .filter(p -> p.getAge() > 25 )
                .filter(p -> Objects.nonNull(p.getCity()))
                .filter(p -> p.getCity().equals("Berlin"))
                .collect(Collectors.toList());

        System.out.println(personList);


    }// Method area

    // Task 1
    public static List<Integer> filterList(List<Integer> integers) { // filterList
        return integers.stream()
                .filter(i -> i > 10 && i < 100)
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());

    }

    // Task 2
    public static List<String> filterStrings(List<String> strings) {

        return strings.stream()
                // Первый вариант решения
             //   .filter(s -> s.charAt(0) == 'A')
                // Второй вариант решения
             //    .filter(s -> s.substring(0, 1).equals("A"))
                // третий вариант решения (самый верный,самый правильный)
                .filter(str -> str.startsWith("A"))// проверяет, начинается ли строка на определенную букву
//                .filter(str -> str.endsWith("a"))// проверяет, заканчивается ли строка на определенную букву
                // четвертый вариант решения
//                .filter(str -> str.contains("a"))// проверяет, содержит ли строка определенную букву
                .sorted()
                .collect(Collectors.toList());

    }







}


