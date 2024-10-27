package lesson_07;

/**
 * Author Waldemar Ilz
 * {code data} 01.10.2024
 */

public class BlockExample {
    public static void main(String[] args) {

        // Выравнивание кода Ctrl + Alt + L

        int x = 10;



        {
            int y = 5;
            x = x + y;
            System.out.println("x: " + x);
            System.out.println("y: " + y);
        }
           // x = x + y; // Ошибка компиляции. Переменная у не видна (не доступна) в не своего блока.

    }



}