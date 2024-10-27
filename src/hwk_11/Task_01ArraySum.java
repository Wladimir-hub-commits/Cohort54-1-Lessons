package hwk_11;

/**
 * Author Waldemar Ilz
 *{code data} 22.10.2024
 */

/*
Task 1
 Написать метод, который считает сумму всех элементов в массиве.
 */
public class Task_01ArraySum {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5}; // Пример массива
        int totalSum = sumArray(numbers); // Вызов метода для суммы
        System.out.println("Сумма элементов массива: " + totalSum); // Вывод суммы

    }// Method area

    public static int sumArray(int[] array) {
        int sum = 0; // Переменная для хранения суммы
        for (int num : array) { // Проход по каждому элементу массива
            sum += num; // Добавление текущего элемента к сумме
        }
        return sum; // Возврат суммы
    }

}// End class
