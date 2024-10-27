package hwk_11;

/**
 * Author Waldemar Ilz
 *{code data} 22.10.2024
 */

/*
Task 3 * (Опционально)

Написать метод, который проверяет, является ли массив палиндромом
 (читается одинаково с обоих концов).
 */

public class Task_03PalindromeChecker {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 2, 1};
        int[] array2 = {1, 2, 3, 4, 5};

        System.out.println("Массив 1 является палиндромом: " + isPalindrome(array1)); // true
        System.out.println("Массив 2 является палиндромом: " + isPalindrome(array2)); // false

    }// Method area

    public static boolean isPalindrome(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            if (array[left] != array[right]) {
                return false; // Если элементы не равны, массив не палиндром
            }
            left++;
            right--;
        }

        return true; // Если все элементы равны, массив палиндром
    }
}// End class
