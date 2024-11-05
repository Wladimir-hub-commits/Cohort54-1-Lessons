package hwk_14;

/**
 * Author Waldemar Ilz
 *{code data} 31.10.2024
 */

/*
Task 1
Сумма четных чисел
Напишите метод, который вычисляет сумму всех четных
 чисел в массиве.
 */

public class Task_1 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int result = sumEvenNumbers(array);
        System.out.println("Сумма четных чисел: " + result);

    }//Methods area

    public static int sumEvenNumbers(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
        return sum;
    }


} // End class
