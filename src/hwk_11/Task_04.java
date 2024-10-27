package hwk_11;

import java.util.Arrays;

/**
 * Author Waldemar Ilz
 *{code data} 22.10.2024
 */

public class Task_04 {

    public static void main(String[] args) {
        int[] array = {2, 2, 3, 6, 7, 2, 5}; // 2
        int[] res = removeElement(array, 2);
        System.out.println(Arrays.toString(res));

    }

    public static int[] removeElement(int[] nums, int element) {
        // Сколько элементов мне нужно удалить?
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == element) {
                count++;
            }
        }

        int[] result = new int[nums.length - count];

        for (int i = 0, idx = 0; i < nums.length; i++) {
            if (nums[i] != element) {
                // надо записывать
                result[idx] = nums[i];
                idx++;
            }
        }

        return result;
    }

}
