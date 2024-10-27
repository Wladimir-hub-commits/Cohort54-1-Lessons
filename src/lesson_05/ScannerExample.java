package lesson_05;

/*
 * @Author Waldemar Ilz
 *{@code data} 24.09.2024
 */

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        // Подготовка программы к чьтению дынных от пользователя
        Scanner scanner = new Scanner(System.in);

        // Спросить имя
        System.out.println("Waldemar Ilz:");
        String name = scanner.nextLine();

        System.out.println(name + 1);

        // Спросить возраст
        System.out.println("44");
        int age = scanner.nextInt();
        // Обнулить сканер . скушать хвост строки
        scanner.nextLine();
        System.out.println(age + 1);

        // Введите кол-во детей
        System.out.println("4");
        int children = scanner.nextInt();
        scanner.nextLine();
        System.out.println(children);


        // Мы можем получить double
        System.out.println("Введите double");
        double doubleVar = scanner.nextDouble();
        System.out.println(doubleVar);
    }
}
