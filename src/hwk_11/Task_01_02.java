package hwk_11;


/**
 * Author Waldemar Ilz
 *{code data} 22.10.2024
 */

/*
Task 1
Написать метод, который считает сумму всех элементов в массиве.

Task 2
Написать метод, который находит среднее значение элементов в массиве (среднее арифметическое).
 */

public class Task_01_02 {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = sumArray(array);
        System.out.println("Сумма элементов в массиве: " + sum);

        double average = averageArray(array);
        System.out.println("Среднее значение: " + average);


    } // Methods area

    public static int sumArray(int[] arr) {
        if (arr == null || arr.length == 0) return 0; // не лучший вариант, но другого пока нет

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; // sum = sum + arr[i]
        }

        return sum;
    }

    public static double averageArray(int[] arr) {
        if (arr == null || arr.length == 0) return 0;

        return sumArray(arr) / (double) arr.length;
    }


}// End class
