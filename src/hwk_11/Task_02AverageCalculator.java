package hwk_11;

/**
 * Author Waldemar Ilz
 *{code data} 22.10.2024
 */

/*

Task 2
Написать метод, который находит среднее значение элементов в массиве
(среднее арифметическое).
 */

public class Task_02AverageCalculator {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        double average = calculateAverage(array);
        System.out.println("Среднее значение: " + average); // Выводим среднее значение

    } // Methods area

    public static double calculateAverage(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0; // Возвращаем 0 для пустого массива
        }

        double sum = 0; // Для хранения суммы элементов массива
        for (int number : numbers) {
            sum += number; // Суммируем элементы
        }

        return sum / numbers.length; // Делим сумму на количество элементов
    }

}// End class
