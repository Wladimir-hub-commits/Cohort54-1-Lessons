package lesson_03;


// Author: Waldemar Ilz
// @data 17.09.2024


public class Variables {
    public static void main(String[] args) {

        int myFirstVariable; // Объявление (декларация) переменной типа int

        myFirstVariable = 1; // первое присвоение значения переменной называется инициализация.

        int mySecondVariable = 25; // Объявление и инициализация в одной строке

        System.out.println(myFirstVariable);

        System.out.println(mySecondVariable);

        // Ctrl + Alt = L - Выравнивает код.

        mySecondVariable = 50; // присвоение нового значения ( переопределение значения переменной )

        System.out.println("Значение переменной mySecondVariable: " + mySecondVariable);

        byte byteVariable = 125; // Объявление и инициализация переменнеой типа byte
        System.out.println("byteVariable: " + byteVariable);

        // Ctrl + D - продублировать строчку. в которой находится куросор
        // Ctrl + y - удалить строчку в которой находится курсор
        // Shift + Alt + стрелка в верх в нис

        byteVariable = -100;
        System.out.println("byteVariable: " + byteVariable);

        System.out.println("byteVariable: " + byteVariable);
        short shortVariable; // Обявление переменной  типа Short
        shortVariable = 31000; // Инициация переменной


        System.out.println("shortVariable:" + shortVariable);

        // Знак _ не влияет на значения перемемнной
        long longVariable = 2_100_000_000_000_000L;
        // L  в конце числа - сказать компилятотору, что это число в формате  long
        System.out.println("longVariable: " + longVariable);

        double doubleVar = 10.5421; // Объявление и инициализация переменной типа  double
        System.out.println("doubleVar: " + doubleVar);

        float floatVar = 11.65f; // f - указатель, что число в формате float
        System.out.println("floatVar: " + floatVar);


    }
}
