package hwk_06;

import java.util.Scanner;

/**
 * Author Waldemar Ilz
 *{code data} 01.10.2024
 */

/*
Task 3
Попросите пользователя ввести целое число с клавиатуры.
Ваша программа должна вывести строку в формате:
Число: 6 четное: true; кратно 3: true; четное и кратное 3: true
Число: 3 четное: false; кратно 3: true; четное и кратное 3: false
Copy
Проверьте работу вашей программы, вводя разные числа. Убедитесь в правильности выдаваемой строки
 */
public class Task_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int input = scanner.nextInt();
        scanner.nextLine();

        boolean isEven = input % 2 == 0;
        boolean isDevByThree = input % 3 == 0;
        boolean isTwice = isEven && isDevByThree;

        System.out.printf("Число: %d чётное: %s; кратно 3: %s; четное кратное 3: %s\n ",
                input, isEven, isDevByThree, isTwice);



    }
}
