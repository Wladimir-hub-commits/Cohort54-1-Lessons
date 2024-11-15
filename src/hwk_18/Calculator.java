package hwk_18;

/**
 * Author Waldemar Ilz
 * {code data} 13.11.2024
 */

/*
Task 1
Класс "Калькулятор"
Создайте класс Calculator, который будет предоставлять

базовые арифметические операции:
сложение,
 вычитание,
 умножение и
  деление
Класс должен содержать:

Статические методы для каждой математической операции, принимающие
 два аргумента и возвращающие результат операции.
 */

public class Calculator {
    public static void main(String[] args) {
        double num1 = 50;
        double num2 = 25;

        System.out.println(" сложение: " + Calculator.addition(num1, num2));
        System.out.println(" вычитание: " + Calculator.subtract(num1, num2));
        System.out.println("умножение; " + Calculator.multiply(num1, num2));
        System.out.println("деление:" + Calculator.divide(num1, num2));
    }

    //  Статический метод для сложения
    public static double addition(double a, double b) {
        return a + b;
    }

    //  Статический метод для вычитания
    public static double subtract(double a, double b) {
        return a - b;
    }

    //  Статический метод для умножения
    public static double multiply(double a, double b) {
        return a * b;
    }

    //  Статический метод для деления
    public static double divide(double a, double b) {
        return a / b;
    }

    public static int divide(int a, int b) {
        System.out.println("int division");
        if (b == 0) {
            // Todo хорошего решения нет.
            return Integer.MAX_VALUE;
        }
        return a / b;
    }
}