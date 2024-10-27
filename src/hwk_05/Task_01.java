package hwk_05;

import java.util.Scanner;

/**
 * Author Waldemar Ilz
 *{code data} 25.09.2024
 */

/*
Task 1
1.Напишите программу, которая будет просить у пользователя ввести его имя с клавиатуры.
2.Используя Scanner, сохраните имя в переменную типа String.
3.Выведите на экран количество символов в имени пользователя.
4.Создайте две переменные типа char: одна должна хранить первый символ имени, другая — последний.
5.Выведите на экран десятичный код (код символа в десятичной системе счисления) первого и последнего символа имени.
 */

public class Task_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Waldemar Ilz");
        String name = scanner.nextLine();

        int length = name.length();
        System.out.println("количество символов в имени пользователя:" + name.length());

        char firstChar = name.charAt(0);
        char lastChar = name.charAt(length - 1);

        System.out.println("firstChar:" + (int)firstChar );
        System.out.println("lastChar:" + (int)+ lastChar);





    }
}
