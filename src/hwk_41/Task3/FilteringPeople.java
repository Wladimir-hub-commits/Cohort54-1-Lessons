package hwk_41.Task3;

import java.util.List;
import java.util.stream.Stream;

/**
 * Author Waldemar Ilz
 * {code data} 27.02.2025
 */


public class FilteringPeople {

    public static void main(String[] args) {
        task3();

    }// Method area

    private static void task3() {

        List<Person> people = List.of(new Person("John", 25, "New York"),
                new Person("Alice", 30, "London"),
                new Person("Bob", 20, "Paris"),
                new Person("Eve", 35, "Berlin"));

        int age = 25;
        String city = "Berlin";

        Stream<Person> filteredPeople = people.stream().filter(person -> person.getAge() > 25 && person.getCity().equals("Berlin"));

        filteredPeople.forEach(System.out::println);


    }


}
