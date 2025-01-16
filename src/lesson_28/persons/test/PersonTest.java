package lesson_28.persons.test;

import lesson_28.persons.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * Author Waldemar Ilz
 * {code data} 17.12.2024
 */

public class PersonTest {

    Person person;
    String startEmail = "john@test.com";
    String startPassword = "qwerty1Q$";

    @BeforeEach
    void setUp() {
        person = new Person(startEmail, startPassword);

    }

    @Test
    void testValidEmailSet() {
        String validEmail = "valid@test.com";

        person.setEmail(validEmail);

        assertEquals(validEmail, person.getEmail());
        assertNotEquals(startEmail, person.getEmail());
    }

    /*
    1. Берём невалидный email
    2. Устанавливаем во сеттером персону
    3. Ожидаемый результат: invalidEmail установлен не будет
    4.

     */

    // testmail.net
    // test@mail.net

    // Тест, что не устанавливаются не валидные е-майлы
    @ParameterizedTest
    @MethodSource("invalidEmailData")
    void testInvalidEmailSet(String invalidEmail) {
        person.setEmail(invalidEmail);
        assertNotEquals(invalidEmail, person.getEmail());
        assertEquals(startEmail, person.getEmail());
    }


    static Stream<String> invalidEmailData() {
        return Stream.of(
                "testmail.net",
                "test@@mail.net",
                "test@mai@l.net",
                "test@mailnet",
                "test@mail.net.",
                "test@milne.t",
                "test@ mail.net",
                "test@ma!il.net",
                "t#est@mail.net",
                "1test@mail.net",
                "_test@mail.net",
                ".test@mail.net",
                "test+1@mail.net"

        );


    }
}
