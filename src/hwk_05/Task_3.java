package hwk_05;

import java.util.Scanner;

/**
 * Author Waldemar Ilz
 *{code data} 25.09.2024
 */

/*
Task 3* (Опционально)
1.Попросите пользователя ввести строку чётной длины с клавиатуры.
2.Распечатайте два средних символа строки.

Например:
.Для строки "string" результат будет "ri".
.Для строки "code" результат будет "od".
.Для строки "Practice" результат будет "ct"
 */



public class Task_3 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("ввести строку чётной длины:");
        String input = scanner.nextLine();


        int index = input.length() / 2 - 1 ;

        // Opt1
        System.out.println("" + input.charAt(index) + input.charAt(index + 1));

        // Opt2

        String substring = input.substring(index, index + 2 );
        System.out.println(substring);



    }
}
