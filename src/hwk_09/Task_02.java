package hwk_09;

/**
 * Author Waldemar Ilz
 *{code data} 15.10.2024
 */

/*
Task 2
Написать метод, принимающий на вход целое число. Метод должен вывести
 на экран 2 в степени этоЧисло

Например: Если в метод пришло число 3 - метод должен вывести
 число 8 (так как 2 в степени 3 = 8)

класс Math для нахождения степени числа использовать нельзя ;)
 */

public class Task_02 {
    public static void main(String[] args) {
    int pow = 10;

    powTwo(pow);

    }// Methods area

    public static void powTwo(int n){
        // 2 ^ 3 = 2 * 2 * 2
        // 2 ^ 0 = 1;

        // запоминаю, пришла изначально положительная степень или отрицательная
        boolean isPositive = n >= 0;

       // n = (isPositive) ? n : n * -1;

        // Если не положительно
        if (!isPositive) n *= -1;

        int result = 1;
        for (int i = 0; i < n; i ++){
            result *= 2;
        }
        if (isPositive) {
            System.out.printf("2 ^ %d = %d\n", n, result);
        }else{
            System.out.printf("2 ^ %d = %.4f\n", n, 1.0 / result);
        }
    }






}// End class
