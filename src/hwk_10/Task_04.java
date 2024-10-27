package hwk_10;

/**
 * Author Waldemar Ilz
 *{code data} 17.10.2024
 */

/*
Task 4* со звездочкой (Опционально)
Дано: Два отсортированных массива целых чисел. Вам нужно найти элемент,
 который будет находиться на k-й позиции в объединенном
 отсортированном массиве.

Массив 1 - {100, 112, 256, 349, 770}
Массив 2 - {72, 86, 113, 119, 265, 445, 892}
k = 7
Copy
Вывод : 256

Можно такой вывод:

72, 86, 100, 112, 113, 119, 256
Искомое число: 256
Copy
Объединенный отсортированный массив был бы такой (выводить,
формировать его не обязательно) -

[72, 86, 100, 112, 113, 119, 256, 265, 349, 445, 770, 892]
Copy
7-й элемент (по счету) этого массива хранит значение 256.

 */

public class Task_04 {
    public static void main(String[] args) {
        int[] array1 = {100, 112, 256, 349, 770};
        int[] array2 = {72, 86, 113, 119, 265, 445, 892};
        int k = 7; // Искомая позиция (1-индексированная)

        int result = findKthElement(array1, array2, k);
        System.out.println("Искомое число: " + result);
    }

    public static int findKthElement(int[] array1, int[] array2, int k) {
        int len1 = array1.length;
        int len2 = array2.length;

        int index1 = 0, index2 = 0;

        while (true) {
            // Если массив 1 исчерпан
            if (index1 == len1) {
                return array2[index2 + k - 1];
            }
            // Если массив 2 исчерпан
            if (index2 == len2) {
                return array1[index1 + k - 1];
            }
            if (k == 1) {
                return Math.min(array1[index1], array2[index2]);
            }

            int newIndex1 = Math.min(index1 + k / 2 - 1, len1 - 1);
            int newIndex2 = Math.min(index2 + k / 2 - 1, len2 - 1);

            if (array1[newIndex1] <= array2[newIndex2]) {
                k -= (newIndex1 - index1 + 1);
                index1 = newIndex1 + 1; // Увеличиваем индекс в первом массиве
            } else {
                k -= (newIndex2 - index2 + 1);
                index2 = newIndex2 + 1; // Увеличиваем индекс во втором массиве
            }
        }
    }
}
