package hwk_28;

import lesson_28.persons.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * Author Waldemar Ilz
 * {code data} 17.12.2024
 */

public class PersonTestHW {


    Person person;
    String startEmail = "john@test.com";
    String startPassword = "qwerty1Q$";

    @BeforeEach
    void setUp(){
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
    1. Берем невалидный email
    2. Устанавливаем его сеттером персону
    3. Ожидаемый результат: invalidEmail установлен не будет
    4.
     */

    // testmail.net
    // test@@mail.net

    @ParameterizedTest
    @MethodSource("invalidEmailData")
    void testInvalidEmailSet(String invalidEmail) {
        person.setEmail(invalidEmail);
        assertNotEquals(invalidEmail, person.getEmail());
        assertEquals(startEmail, person.getEmail());}

    static Stream<String> invalidEmailData() {
        return Stream.of(
                "testmail.net",
                "test@@mail.net",
                "test@mai@l.net",
                "test@mailnet",
                "test@mail.net.",
                "test@mailne.t",
                "test@ mail.net",
                "test@ma!il.net",
                "t#est@mail.net",
                "1test@mail.net",
                "_test@mail.net",
                ".test@mail.net",
                "test+1@mail.net"
        );
    }


    // Проверка валидности пароля
    @ParameterizedTest
    @ValueSource(strings = {"qwerty1Q!", "1FDGADFFa$", "sad %Der0", "парольП4%"})
    void testValidPasswordSet(String validPassword) {
        person.setPassword(validPassword);

        Assertions.assertNotNull(person.getPassword());
        assertEquals(validPassword, person.getPassword());
    }

// Проверка невалидности пароля
    @ParameterizedTest
    @MethodSource("invalidPasswordData")
    void testInvalidPasswordSet(String invalidPassword) {
        person.setPassword(invalidPassword);

        assertNotEquals(invalidPassword, person.getPassword());
        assertEquals(startPassword, person.getPassword());
    }
// Проверка невалидности пароля
    static Stream<String> invalidPasswordData() {
        return Stream.of(
                "qwer!1Q", //короткий пароль
                "ERYTYRTYT%555", // без маленькой буквы
                "48asd*dfg", // без большой буквы
                "WeR(reF[D", // без цифры
                "5TgdfgfRE50" // без спец.символа
        );
    }

     /*
    Требования к паролю
    1. Длина >= 8
    2. Должна быть мин 1 маленькая буква
    3. Должна быть мин 1 большая буква
    4. Должна быть мин 1 цифра
    4. Должен быть мин 1 спец.символ "!%$@&*()[]"
     */
}
