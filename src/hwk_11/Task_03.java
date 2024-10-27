package hwk_11;



public class Task_03 {
    public static void main(String[] args) {
        int[] array = {5, 8, 9, 10, 10, 9, 8, 5};

        System.out.println("isPalindrome: " + isPalindrome(array));
        System.out.println("isPalindromeV2: " + isPalindromeV2(array));

    }

    public static boolean isPalindrome(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            if (array[left] != array[right]) return false;
            left++;
            right--;
        }

        return true;
    }

    public static boolean isPalindromeV2(int[] array) {
        int len = array.length;
        for (int i = 0; i < len / 2; i++) {
            if (array[i] != array[len - 1 - i]) return false;
        }

        return true;
    }
}
