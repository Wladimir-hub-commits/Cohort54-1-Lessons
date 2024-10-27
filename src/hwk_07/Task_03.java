package hwk_07;

import java.util.Scanner;

/**
 * Author Waldemar Ilz
 *{code data} 05.10.2024
 */

/*
Task 3 (Повышенной сложности, опционально)

1.Программа предлагает пользователю ввести четырехзначное число.
2.Ввод осуществляется только в формате строки (String).
3.Если введенное значение не является четырехзначным числом, должно выводиться сообщение об ошибке, и программа завершает работу.
4.Проверить, является ли число "счастливым билетом". Для этого нужно сравнить сумму первых двух цифр с суммой последних двух цифр.
Примеры:

Число 1450 -> (1+4) = 5; (5+0) = 5; 5 равно 5 - число счастливое.
Число 1654 -> (1+6) = 7; (5+4) = 9; 7 не равно 9 - число НЕ является счастливым.
 */

public class Task_03 {
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
