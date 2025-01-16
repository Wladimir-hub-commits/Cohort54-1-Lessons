package lesson_28.persons;

/**
 * Author Waldemar Ilz
 * {code data} 17.12.2024
 */

import lesson_27.enums.days.Day;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;


class ExampleTest {


    // Метод, помеченный @BeforeEach будет выполняться перед КАЭДЫМ тестовым методом
    @BeforeEach
    void setUp() {
        System.out.println("Метод BeforeEach");

    }
    // Основные аннотации в JUnit 5:
    // Аннотации в Java — это специальный тип метаданных,
    // которые предоставляют информацию о программе, но не изменяют её поведение.
    // Они могут использоваться для различных целей, таких как предоставление
    // инструкций компилятору, формирование документации, а также для выполнения
    // различных фреймворков, например, в Spring или Hibernate.
/*
       @BeforeEach - будет выполняться перед каждым методом
       @BeforeAll - метод выполняется только один раз перед выполнением первого теста (Требует static)
       @AfterEch - будет выполняться после каждого метода
       @AfterAll - метод выполняется только один раз после выполнения последнего теста (Требует static)
       @Disabled - указывает, что тест отключён и выполнять метод не требуется

 */


    // Указывает, что метод является тестовым. Таким образом Junit знает
    // что этот метод нужно запустить во время выполнения тестов

    @Test
    public void testAddition() {
        System.out.println("Test addition");

        int result = 2 + 2;

        // Основные методы для проверки утверждений:

        // assertEquals(expected, actual)
        assertEquals(4, result);// проверяет равны ли два значения
        assertNotEquals(9, result);// тест будет пройден, если "не ожидаемый результат" не равен фактическому
        assertTrue(result >= 4); // проверяет, что условие верно (возвращает true)
        assertFalse(result > 4);// проверяет, что условие ложное (условие возвращает false)
        assertNull(null);// Проверяет, что объект равен null
        assertNotNull("String");// Проверяет, что объект не равен null
    }

    @Disabled
    @Test
    public void emptyTest() {
        System.out.println("Empty test");
        // Пустой тестовый метод считается успешно пройденным
        // Так как в методе нет ложного утверждения
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 5, 9, 11})
    public void testNumbers(int number) {
        System.out.println("number" + number);
        assertTrue(number > 0);

    }

    @ParameterizedTest
    @ValueSource(strings = {"apple ", "bana ", "cherry"})
    public void tesFruit(String fruit) {
        System.out.println("fruit = " + fruit);
        assertTrue(fruit.length() > 2);

    }

    //Apple,1;
    // banana,2;
    // CSV - Comma - Separated - Value
    @ParameterizedTest
    @CsvSource({"apple, 1", "banana, 2", "cherry, 3"})
    void testWithCsvSource(String fruit, int rank) {
        System.out.println(fruit + " | " + (rank + 10));
        assertTrue(fruit.length() > 4 && rank > 0);
    }

    // Источник данных файл в формате CSV
    @ParameterizedTest
    @CsvFileSource(resources = "data.csv")
    void testWithCsvFileSource(String fruit, int rank, boolean flag) {
        System.out.println(fruit + " | " + rank + " | " + !flag);
        assertNotNull(fruit);
        assertTrue(rank > 0);

    }

    @ParameterizedTest
    @EnumSource(Day.class)
    void testEnums(Day day) {
        System.out.println("day = " + day);
        assertNotNull(day);
    }

    @ParameterizedTest
    @MethodSource("testDataString")
    public void testWithMethodSource(String argument) {
        System.out.println("argument = " + argument);
    }

    static Stream<String> testDataString() {
        return Stream.of("apple ", "banana ", "cherry");


    }

    static Stream<Integer> testInteger() {
        return Stream.of(1, 5, 6, 7, 78, 8);

    }

    //
    @ParameterizedTest
    @MethodSource("testDataArguments")
    void testMethodSource2(int value, int expected, boolean isEquals) {
        System.out.println(value + " | " + expected + " | " + isEquals);
        int result = value * value;
        assertEquals(isEquals, result == expected);

    }

    static Stream<Arguments> testDataArguments() {
        return Stream.of(
                Arguments.of(2, 4, true),
                Arguments.of(3, 9, true),
                Arguments.of(4, 15, false)

        );
    }

    @ParameterizedTest
    @MethodSource("testPersonData")
    void testPersonData(Person person, String email) {
        System.out.println("peron = " + person);
        System.out.println("email = " + email);
        System.out.println("===============\n");


    }

    static Stream<Arguments> testPersonData() {
        Person person = new Person("test@mail", "pass1Q!4");
        return Stream.of(
                Arguments.of(person, "new1234@"),
                Arguments.of(new Person("invalid.email.com", "password"), "mail.test.com")

        );
    }



}

