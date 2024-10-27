package hwk_11;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Author Waldemar Ilz
 *{code data} 22.10.2024
 */

/*
Task 4 * (Опционально)
Написать метод, который удаляет все вхождения заданного числа
из массива и возвращает новый массив без этого числа.
 */

public class Task_04RemoveOccurrences {

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 3, 5, 3};
        int numberToRemove = 3;

        int[] newArray = removeOccurrences(originalArray, numberToRemove);

        System.out.println("Массив без вхождений числа " + numberToRemove + ": " + Arrays.toString(newArray));

    }// Method area

    public static int[] removeOccurrences(int[] array, int numberToRemove) {
        ArrayList<Integer> resultList = new ArrayList<>();

        for (int num : array) {
            if (num != numberToRemove) {
                resultList.add(num);
            }
        }

        // Преобразуем ArrayList обратно в массив
        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }

        return resultArray;
    }

}// End class
