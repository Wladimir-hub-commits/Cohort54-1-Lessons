package hwk_08;

import java.util.Scanner;

/**
 * Author Waldemar Ilz
 *{code data} 10.10.2024
 */

/*
Task 5 * (Опционально)
Программа запрашивает у пользователя ввод произвольного числа.
Вывести сумму цифр этого числа.

Пример:

567432 -> 5+6+7+4+3+2 -> 27

 */

public class cycleTask_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите произвольное число ");
        long input = scanner.nextLong();
        scanner.nextLine(); // Кушает остаток счисления, эту строчку надо задавать всегда нужн нам сканнер или не нужен.

        if (input < 0){
            input = input * - 1;
        }
        // Копирую значение для обработки во втором варианте
        long num2 = input;

        // Откусывание цифры
        int sum = 0;
        while (input > 0){
            //код откусывания чисел
            long currentDigit = input % 10;

            sum += currentDigit = input % 10;

            System.out.println(currentDigit + "+");

            input = input / 10;
        }
        System.out.println(" = " + sum);

        System.out.println("\n======option2=======");
        String numStr = "" + num2; // Простой способ преобразовать число в String (строку)
//        numStr = String.valueOf(num2); Ещё один способ преобразовать число в  String (строку)

        int len = numStr.length();
        int sum2 = 0;
        while (len > 0){
            int pow = (int) Math.pow(10, len -1 ); // 10 в степени (длины -1)
            long digit = num2 / pow; // получаем самую левую цифру
            sum2 +=digit;

            System.out.print(digit + "+");
            num2 = num2 % pow; // отризаем уже полученную цифру
            len--;
        }
        System.out.println(" = " + sum2);
    }
}
