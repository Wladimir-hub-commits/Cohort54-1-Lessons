package hwk_06;

/**
 * Author Waldemar Ilz
 *{code data} 01.10.2024
 */

/*
Task 4
Дан следующий код. Вашей задачей является предсказать, какой вывод будет напечатан в консоли после выполнения программы.

public class BooleanTest {
    public static void main(String[] args) {
        int a = 8;
        int b = 3;
        boolean result;

        result = (a + b) > 10;
        System.out.println("Result 1: " + result);

        result = (a - b) == 5;
        System.out.println("Result 2: " + result);

        result = (a * b) != 24;
        System.out.println("Result 3: " + result);

        result = (a / b) >= 2;
        System.out.println("Result 4: " + result);

        result = !(a % b == 2);
        System.out.println("Result 5: " + result);
    }
}
Copy
Предскажите, что будет выведено на консоль для Result 1 до Result 5. Объясните кратко свой ответ.
 */
public class Task_04 {
    public static void main(String[] args) {

         // result1 = ( 8 + 3 ) = 11 -> 11 > 10 -> true.

         // result2 = ( 8 - 3 ) = 5 -> 5 == 5 -> true.

        // result3 = ( 8 * 3 )= 24 ->  24 != 24 -> false.

        // result4 = ( 8 / 3) = 2 -> 2 >= 2 -> true.

        // result5 = !( 8 % 3 == 2 ) -> 2 == 2 -> true -> !true -> false.

    }
}
