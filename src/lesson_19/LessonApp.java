package lesson_19;

/**
 * Author Waldemar Ilz
 *{code data} 14.11.2024
 */

import java.util.Locale;

public class LessonApp {
    public static void main(String[] args) {

        ConstantDemo demo = new ConstantDemo(10);
        System.out.println(demo.getX());

        ConstantDemo demo2 = new ConstantDemo(20);
        System.out.println(demo2.getX());

        System.out.println(ConstantDemo.COUNTRY);

        // Константа - для определения константы необходимо добавить модификаторы static final к полю класса
        // Константа - это статическое финальное поле, содержимое которого неизменно.
        // Константами могут быть примитивы, String, неизменяемые типы данных.

        // Константа - переменная, которою не может изменить ни один экземпляр (объект) класса.
        // Константа создается и инициализируется один раз для всех объектов, сколько бы их не было

        final String text = "Hello World";
        String text1 = text.toUpperCase();
        System.out.println(text);
        System.out.println("Новая строка, полученная с использование значения строки text: " + text1);

    }

}
