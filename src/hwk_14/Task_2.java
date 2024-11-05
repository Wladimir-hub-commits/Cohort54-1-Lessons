package hwk_14;

/**
 * Author Waldemar Ilz
 *{code data} 31.10.2024
 */

/*
Task 2
Найти второе по величине число в массиве
Напишите метод, который находит второе по величине
число в массиве целых чисел.
 */

public class Task_2 {


    public static void main(String[] args) {
        int[] test = {7, 9, 6, 5, 8, 10, 3, 10};

        int second = secondMaxValue(test);
        System.out.println("second max: " + second);
    }

    public static int secondMaxValue(int[] array) {
        if (array == null || array.length == 0) {
            return Integer.MIN_VALUE; // минимальное число типа int
        }
        // Integer.MAX_VALUE максимальное число диапазона int

        int max = array[0];
        int secondMax = array[0];

        for (int i = 1; i < array.length; i++) {
            int num = array[i];

            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }

        return secondMax;


    }


}// End class
