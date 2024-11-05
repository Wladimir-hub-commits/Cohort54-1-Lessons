package hwk_14;


/**
 * Author Waldemar Ilz
 *{code data} 31.10.2024
 */

/*
Task 1
Сумма четных чисел

Напишите метод, который вычисляет сумму всех четных чисел в массиве.

 */
public class Task_01 {

    public static void main(String[] args) {
        int[] testArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(sumArray(testArray));
    }

    public static int sumArray(int[] array) {
        if (array == null) return 0;

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum += array[i];
            }

        }
        return sum;
    }

}
