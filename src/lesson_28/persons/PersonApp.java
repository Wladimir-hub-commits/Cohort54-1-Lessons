package lesson_28.persons;

/**
 * Author Waldemar Ilz
 * {code data} 17.12.2024
 */

public class PersonApp {
    public static void main(String[] args) {

        Person person = new Person(" ", "asssSSS1$");

        person.setEmail("valid@email.com");
        System.out.println(person);
    }
}
