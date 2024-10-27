package hwk_07;


import java.util.Scanner;

/**
 * Author Waldemar Ilz
 *{code data} 03.10.2024
 */
/*
Task 1
Необходимо написать программу, которая предлагает пользователю ввести число на выбор: 1, 2 или 3.

Программа должна сказать, какое число ввёл пользователь: Один, Два, или Три (текстом)
 */
public class Task_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("ввести число на выбор: 1, 2 или 3");
        int input = scanner.nextInt();
        scanner.nextLine();

        switch (input) {
            case 1:
                System.out.println("Вы ввели один");
                break;
            case 2:
                System.out.println("Вы ввели два");
                break;
            case 3:
                System.out.println("Вы ввели три");
                break;
            default:
                System.out.println("Ваш ввод не корректен!");
        }

        if (input == 1 ) {
            System.out.println("Вы ввели один");
        } else if (input == 2) {
            System.out.println("Вы ввели два");
        } else if (input == 3) {
            System.out.println("Вы ввели три");
        }
//        else if (input == 4) {
//            System.out.println("Вы ввели четыре");
//        }
        else {
            System.out.println("вы ввели что-то другое!!");
        }

    }
}