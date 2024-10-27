package hwk_09;

import java.util.Random;

/**
 * Author Waldemar Ilz
 *{code data} 15.10.2024
 */

/*
Task 3 * (Опционально)
Заполните массив 50 случайными числами от 1 до 100. Программа должна
найти, и вывести на экран все простые числа. Посчитайте сколько
 получилось таких чисел в массиве. Простое число - число,
 которое делится на цело только на 1 и само себя.

Пример простых чисел: 3, 5, 7, 11, 13 и т.д.
 */

public class Task_03 {
    public static void main(String[] args) {
        int[] numbers = new int[50];
        Random random = new Random();

        // Заполнение массива случайными числами от 1 до 100
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100) + 1;
        }

        System.out.println("Сгенерированные числа:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        // Todo посмотреть slash \
       // System.out.println("\
        //        Простые числа:");
        int primeCount = 0;

        for (int number : numbers) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                primeCount++;
            }
        }
        // Todo посмотреть slash \
      //  System.out.println("\
            //    Количество простых чисел: " + primeCount);
    }

    // Метод для проверки, является ли число простым
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
