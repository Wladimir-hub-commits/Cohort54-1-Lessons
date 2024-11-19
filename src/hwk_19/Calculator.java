package hwk_19;

/**
 * Author Waldemar Ilz
 * {code data} 19.11.2024
 */


/*

Task 1
Дополните Класс "Калькулятор" из предыдущего домашнего задания
Класс Calculator, который будет предоставлять

- базовые арифметические операции: сложение, вычитание, умножение и деление
 (сделано в прошлом ДЗ)
- Вычисление длины окружности и площади круга по ее радиусу
Copy
Класс должен содержать:

- Статические методы для каждой математической операции, принимающие
 два аргумента и возвращающие результат операции ((сделано в прошлом ДЗ))
- Методы для вычисления длины окружности и площади круга,
принимающий радиус и возвращающий результат.
- Константу (число Пи)


 */


public class Calculator {
    public static void main(String[] args) {
        double a = 50;
        double b = 25;

        System.out.println("Сложение: " + add(a, b));
        System.out.println("Вычитание: " + subtract(a, b));
        System.out.println("Умножение: " + multiply(a, b));
        System.out.println("Деление: " + divide(a, b));

        double radius = 15;
        System.out.println("Длина окружности: " + circumference(radius));
        System.out.println("Площадь круга: " + area(radius));
    }

    // Константа для числа Пи
    public static final double PI = 3.141592653589793;

    // Статический метод для сложения
    public static double add(double a, double b) {
        return a + b;
    }

    // Статический метод для вычитания
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Статический метод для умножения
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Статический метод для деления
    public static double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Деление на ноль невозможно.");
        }
        return a / b;
    }

    // Метод для вычисления длины окружности по радиусу
    public static double circumference(double radius) {
        return 2 * PI * radius;
    }

    // Метод для вычисления площади круга по радиусу
    public static double area(double radius) {
        return PI * radius * radius;
    }






}
